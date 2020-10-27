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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController extends Application implements Initializable {

	private static Stage stage;

	    @FXML private AnchorPane root;
	    @FXML private ImageView imagem;
	    @FXML private Label lbTitulo;
	    @FXML private Label lbSlogan;
	    @FXML private Label lbFone1;
	    @FXML private Label lbNum1;
	    @FXML private Label lbFone2;
	    @FXML private Label lbNum2;
	    @FXML private Button btHotel1;
	    @FXML private Button btHotel2;
	    @FXML private Button btHotel3;
	    @FXML private Button btHotel4;
	    @FXML private Label lbPesquisa;
	    @FXML private TextField txHotel;
	    @FXML private Label lbAviso;
	    @FXML private Button btPerfil;
	    
	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane root = FXMLLoader.load(getClass().getResource("Home.fxml"));

		Scene scene = new Scene(root, 700, 500);

		stage.setTitle("HOST4U - Home");
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
		HomeController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {

		btPerfil.setOnMouseClicked((MouseEvent mouse) -> {
			proximaTela();
		});
		 
		btPerfil.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaTela();
			}
		});
		
		btHotel1.setOnMouseClicked((MouseEvent mouse) -> {
             proximaLogin();
		});
		 
		btHotel1.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaLogin();
			}
		});
		
		btHotel2.setOnMouseClicked((MouseEvent mouse) -> {
            proximaLogin();
		});
		 
		btHotel2.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaLogin();
			}
		});
		
		btHotel3.setOnMouseClicked((MouseEvent mouse) -> {
            proximaLogin();
		});
		 
		btHotel3.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaLogin();
			}
		});
		
		btHotel4.setOnMouseClicked((MouseEvent mouse) -> {
            proximaLogin();
		});
		 
		btHotel4.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaLogin();
			}
		});
		
	}
	
	public void fecharTela() {
		HomeController.getStage().close();
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
	
	public void proximaLogin() {
		LoginController lc = new LoginController();
		fecharTela();
		
		try {
			lc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {

		launch(args);
	}

}
