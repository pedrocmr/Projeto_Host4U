package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReservaController extends Application implements Initializable {

	private static Stage stage;

	    @FXML private AnchorPane root;
	    @FXML private ImageView imagem;
	    @FXML private Label lbTitulo;
	    @FXML private Label lbEntrada;
	    @FXML private SplitMenuButton menuCheckin;
	    @FXML private Label lbSaida;
	    @FXML private SplitMenuButton menuCheckout;
	    @FXML private Label lbPessoas;
	    @FXML private Label lbQuartos;
	    @FXML private MenuButton menuPessoas;
	    @FXML private MenuButton menuQuartos;
	    @FXML private RadioButton rdViajar;
	    @FXML private Button btConfirmar;
	    @FXML private Button btVoltar;
	    
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("Reserva.fxml"));
		Scene scene = new Scene(root, 600, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Reserva");
		Image imagem = new Image("imagens/iconehotel.png");
		stage.getIcons().add(imagem);

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
		ReservaController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {

		btConfirmar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaTela();
		});
		
		btConfirmar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaTela();
			}
		});
		
		btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaHome();
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaHome();
				
			}
		});
	}

	public void fecharTela() {
		ReservaController.getStage().close();
	}
	
	public void proximaTela() {
		
		PagamentoController p = new PagamentoController();
		fecharTela();
		
		try {
			p.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void proximaHome() {
		HomeController hc = new HomeController();
		fecharTela();
		
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
