package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class MainView extends Application {
	
	Pane root;
	Scene cena;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		initialize();
		primaryStage.setScene(cena);
		primaryStage.show();
		
		
		
	}
	
	private void initialize() {
		
			try {
				root = FXMLLoader.load(getClass().getResource("LoginH4U.fxml"));
				cena = new Scene(root);
			}catch(IOException e) {
				e.printStackTrace();
				
			}
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
