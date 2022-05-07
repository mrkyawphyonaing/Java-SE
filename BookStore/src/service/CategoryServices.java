package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Category;
import util.ConnectionManager;

public class CategoryServices {
	private static CategoryServices INSTANCE;
	private final String insert = "insert into category (name) value (?)";
	private final String update = "update category name = ? where id = ?";
	private final String delete = "delete from category where id =?";
	private final String find = "select * from category where 1 = 1";
	
	private CategoryServices() {}
	
	public static CategoryServices getInstance() {
		if(INSTANCE==null)
			INSTANCE = new CategoryServices();
		return INSTANCE;
	}
	
	public void add(Category c) {
		
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement stmt = con.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
			stmt.setString(1, c.getName());
			stmt.executeUpdate();
			
			ResultSet rst = stmt.getGeneratedKeys();
			
			while (rst.next()) 
				c.setId(rst.getInt(1));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update(Category c) {
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement stmt = con.prepareStatement(update)) {
			
			stmt.setString(1, c.getName());
			stmt.setInt(2, c.getId());
			stmt.executeUpdate();
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete (Category c) {
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement stmt = con.prepareStatement(delete)) {
			
					stmt.setInt(1, c.getId());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Category> findAll () {
		List<Category> list = new ArrayList<>();
		
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement stmt = con.prepareStatement(find)) {
				
				ResultSet rst = stmt.executeQuery();
				while(rst.next())
					list.add(getObject(rst));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}
	public List<Category> findByName (String name) {
		List<Category> list = new ArrayList<>();
		
		try(Connection con = ConnectionManager.getConnection();
				PreparedStatement stmt = con.prepareStatement(find.concat("and name like ?"))) {
				stmt.setString(1, name);
				ResultSet rst = stmt.executeQuery();
				while(rst.next())
					list.add(getObject(rst));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	private Category getObject (ResultSet rst) throws SQLException {
		Category c= new Category();
		c.setId(rst.getInt("id"));
		c.setName(rst.getString("name"));
		return c;
		
	}
}
