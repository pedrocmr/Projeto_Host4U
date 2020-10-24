package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MinhaReservaController extends Application implements Initializable {

	private static Stage stage;
	
	  @FXML
	    private AnchorPane root;

	    @FXML
	    private TableView<?> tabela;

	    @FXML
	    private TableColumn<?, ?> rotuloNome;

	    @FXML
	    private TableColumn<?, ?> rotuloHotel;

	    @FXML
	    private TableColumn<?, ?> rotuloQuarto;

	    @FXML
	    private TableColumn<?, ?> rotuloCheckin;

	    @FXML
	    private TableColumn<?, ?> rotuloCheckout;

	    @FXML
	    private ImageView imagem;

	    @FXML
	    private Button BtSalvar;

	    @FXML
	    private Button btVoltar;
	
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("/gui/MinhaReserva.fxml"));
		Scene scene = new Scene(root, 700, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Minhas Reservas");

		// GERANDO TELA
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
		setStage(stage);

	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		MinhaReservaController.stage = stage;
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}

	

}
