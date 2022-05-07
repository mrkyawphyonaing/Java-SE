package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MainFrame implements Initializable {
	@FXML
	private Label title;
	@FXML
	private Label footer;
	@FXML
	private StackPane viewHolder;
	
	@FXML
	private VBox sideBar;
	
	public void showHome(MouseEvent event) {
		changeActive(event);
		loadView("My Book Store", "home");
	}
	public void showCategory(MouseEvent event) {
		changeActive(event);
		loadView("Category List", "bookcategory");
	}
	public void showBooks(MouseEvent event) {
		changeActive(event);
		loadView("Book List", "booklist");
		
	}
	public void showAuthor(MouseEvent event) {
		changeActive(event);
		loadView("Author List", "authorlist");
		
	}
	
	private void changeActive (MouseEvent event) {
		Node node = (Node) event.getSource();
		sideBar.getChildren().stream()
									.filter(n-> n.getStyleClass().contains("active"))
									.findAny()
									.ifPresent(n-> n.getStyleClass().remove("active"));
		node.getStyleClass().add("active");
	}
	
	public void loadView(String viewname, String viewfile) {
		title.setText(viewname);
		try {
			Parent view = FXMLLoader.load(getClass().getResource(viewfile.concat(".fxml")));
			viewHolder.getChildren().clear();
			viewHolder.getChildren().add(view);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		footer.setText("\u00A9 By JDC \u00A9");
		loadView("My Book Store", "home");
		
	}
	
}
