package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RelatorioAdminController extends Application {
	
	public static Stage stage;
	
	
	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane root = FXMLLoader.load(getClass().getResource("/gui/RelatorioAdmin.fxml"));
		Scene scene = new Scene(root, 700, 500);
		
		stage.setScene(scene);

		
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
		setStage(stage);

		

	}
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		RelatorioAdminController.stage = stage;
	}
	
	
	public static void main(String args[]) {
		launch(args);
	}


}
