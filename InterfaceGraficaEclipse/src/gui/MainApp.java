package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	
	public void start(Stage primaryStage) throws Exception {
		HomeController hc = new HomeController();
	
		try {
			hc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}

}
