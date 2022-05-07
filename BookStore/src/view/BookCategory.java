package view;

import java.net.URL;
import java.util.ResourceBundle;
import entity.Category;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import service.CategoryServices;

public class BookCategory implements Initializable{
		@FXML
		private TextField name;
		@FXML
		private TableView<Category> tbllist;
		@FXML
		private CategoryServices catService;
		
		public void add() {
			Category c = new Category();
			c.setName(name.getText());
			if (c != null) 
				tbllist.getItems().add(c);
			int value = tbllist.getItems().size();
		}
		
		public void upload ( ) {
			
		}
		
		public void search ( ) {
			

		}
		public void clear () {
			name.clear();
			
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			catService = CategoryServices.getInstance();
			
		}
		private class CategoryTable{
			public CategoryTable(Category c) {
				

			}
			
		}


}
