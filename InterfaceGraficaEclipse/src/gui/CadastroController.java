package gui;

import java.net.URL;
import java.rmi.server.LoaderHandler;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
								//extends Application
public class CadastroController extends Application implements Initializable {

	private static Stage stage;
	@FXML private TextField txtLogin;
	@FXML private Text lbLogin;
    @FXML private PasswordField txtSenha;
    @FXML private Text lbSenha;
    @FXML private TextField txtNome;
    @FXML private Text lbNome;
    @FXML private TextField txtCpf;
    @FXML private Text lbCpf;
    @FXML private RadioButton radioMasc;
    @FXML private RadioButton radioFem;
    @FXML private Text lbSexo;
    @FXML private Button btnCadastrar;
    @FXML private Button btnSair;
    @FXML private ImageView imgLogo;
    @FXML private AnchorPane rootPane;
    @FXML
    void cadastrarClick(ActionEvent event) {
    	System.out.println("Click");
    	lbSexo.setText("Teste");
    } 

	public void start(Stage stage) throws Exception {

		 AnchorPane root =  FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
		 Scene scene = new Scene(root, 700, 500);
		
		
		stage.setTitle("HOST4U - Cadastro");
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
		CadastroController.stage = stage;
	}

	

	
	public void initialize(URL location, ResourceBundle resources) {
		
			 
	}
	
	
	public static void main(String args[]) {

		launch(args);
	}
}
