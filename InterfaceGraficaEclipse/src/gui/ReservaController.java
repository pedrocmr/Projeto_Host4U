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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReservaController extends Application implements Initializable{

	private static Stage stage;
	
	@FXML private AnchorPane root;
    @FXML private TableView<?> tabela;
    @FXML private TableColumn<?, ?> rotuloNome;
    @FXML private TableColumn<?, ?> rotuloHotel;
    @FXML private TableColumn<?, ?> rotuloQuarto;
    @FXML private TableColumn<?, ?> rotuloCheckin;
    @FXML private TableColumn<?, ?> rotuloCheckout;
    @FXML private ImageView imagem;
    @FXML private Button BtSalvar;
    @FXML private Button btVoltar;

	public void start(Stage stage) throws Exception {

		AnchorPane root = FXMLLoader.load(getClass().getResource("Reserva.fxml"));

		Scene scene = new Scene(root, 700, 500);

		stage.setTitle("HOST4U - Minhas Reservas");
		Image imagem = new Image("imagens/iconehotel.png");
		stage.getIcons().add(imagem);

		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();

		setStage(stage);// SETTANDO CENA
	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		ReservaController.stage = stage;
	}

    public void initialize(URL location, ResourceBundle resources) {
		
	}

	public static void main(String[] args) {

		launch(args);
	}

	

}
