package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MeuPerfilController extends Application implements Initializable{

	private static Stage stage;
	
	    @FXML private AnchorPane root;
        @FXML private Label texto6;
        @FXML private Label texto2;
        @FXML private Label texto4;
        @FXML private Label texto3;
	    @FXML private Label texto5;
	    @FXML private TextField txNome;
	    @FXML private TextField txSexo;
	    @FXML private TextField txLogin;
	    @FXML private Button btSalvar;
	    @FXML private ImageView imagem1;
	    @FXML private Button btVoltar;
	    @FXML private PasswordField txSenha;
	    @FXML private ImageView imagemHost;
	    @FXML private Button botao3;
 
        @FXML
        void funcionaBotao(ActionEvent event) {
      
    	 System.out.println("salvei!");
     }
     
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("MeuPerfil.fxml"));
		Scene scene = new Scene(root, 700, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Meu Perfil");

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
		MeuPerfilController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {

		launch(args);

	}

}
