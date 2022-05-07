package view;

import entity.CommonDTO;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HomeView {
		@FXML
		private ComboBox<String> category;
		@FXML
		private TextField authorName;
		@FXML
		private TextField bookName;
		@FXML
		private DatePicker releasedDate;
		@FXML
		private TableView<CommonDTO> tblList;
		
		public void search () {
			
		}
		
		public void clear () {
			
		}
}
