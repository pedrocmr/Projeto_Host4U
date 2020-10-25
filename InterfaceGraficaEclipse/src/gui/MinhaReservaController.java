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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MinhaReservaController extends Application implements Initializable {

		private static Stage stage;
	
	    @FXML private AnchorPane root;
	    @FXML private TableView<?> tabela;
	    @FXML private TableColumn<?, ?> rotuloNome;
	    @FXML private TableColumn<?, ?> rotuloHotel;
	    @FXML private TableColumn<?, ?> rotuloQuarto;
        @FXML private TableColumn<?, ?> rotuloCheckin;
	    @FXML private TableColumn<?, ?> rotuloCheckout;
        @FXML private ImageView imagem;
	    @FXML private Button btSalvar;
	    @FXML private Button btVoltar;
	
	@Override
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("MinhaReserva.fxml"));
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
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btSalvar.setOnMouseClicked((MouseEvent mouse) -> {
			System.out.println("salvo!");
		});
		
		btSalvar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				System.out.println("salvo");
			}
		});
		
		btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaTela();
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaTela();
			}
		});
	}
	
	public void fecharTela() {
		MinhaReservaController.getStage().close();
	}
	
	public void proximaTela() {
		
		MeuPerfilController mp = new MeuPerfilController();
		fecharTela();
		
		try {
			mp.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
