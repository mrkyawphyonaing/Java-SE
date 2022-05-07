package com.eduraka;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Running extends Application{

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage Stage) throws Exception {
		  Stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Layout.fxml"))));
		  Stage.setTitle("Layout View");
		  Stage.show();
		
	}

}
