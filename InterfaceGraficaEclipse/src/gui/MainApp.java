package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	
	public void start(Stage primaryStage) throws Exception {
		HomeController hc = new HomeController();
	
		try {
			hc.start(new Stage());
			System.out.println("java version: "+System.getProperty("java.version")); 
			System.out.println("javafx.version: " + System.getProperty("javafx.version"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}

}
