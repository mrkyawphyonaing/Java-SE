package com.eduraka;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Layout implements Initializable {
		@FXML
		private TextField name;
		@FXML
		private TextField mark;
		@FXML
		private DatePicker checkday;
		@FXML
		private ComboBox<String> subject;
		@FXML
		private TableView<Person> tblList;
		@FXML
		private Label label;
		@FXML
		private TableColumn<String, String> nameCol;
		@FXML
		private TableColumn<String, String>markCol;
		@FXML
		private TableColumn<String, String> checkdayCol;
		@FXML
		private TableColumn<String, String> subjectCol;
		
		public void add() {
			Person p = new Person();
			p.setName(name.getText());
			p.setMark(Integer.parseInt(mark.getText()));
			p.setCheckDate(checkday.getValue());
			p.setSubject(subject.getValue());
			if (p != null) 
				tblList.getItems().add(p);
			int value = tblList.getItems().size();
			label.setText("Total Item in table :"+ String.valueOf(value));
		}
		
		public void clear() {
			name.clear();
			mark.clear();
			checkday.setValue(LocalDate.now());
			subject.setValue(null);
			tblList.getItems().clear();
			label.setText("Total Item in table : 0");
		}

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
			markCol.setCellValueFactory(new PropertyValueFactory<>("mark"));
//			checkdayCol.setCellValueFactory(new PropertyValueFactory<>("checkday"));
			subjectCol.setCellValueFactory(new PropertyValueFactory<>("subject"));
			checkdayCol.setCellValueFactory(new PropertyValueFactory<>("checkDate"));
			
			subject.getItems().addAll("Myanmar","English","Mathematic","Physices","Biology","Ecology");
			clear();
		}
}

