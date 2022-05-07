package com.test;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.MainFrame;

public class Project extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root =FXMLLoader.load(MainFrame.class.getResource("mainframe.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Book Store");
		stage.getIcons().add(new Image(new FileInputStream("book2.jpg")));
		stage.setScene(scene);
		stage.show();
		
	}

}