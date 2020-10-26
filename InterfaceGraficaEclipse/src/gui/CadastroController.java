package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controlador.ControleCadastro;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Usuario;
import repositorio.RepositorioUsuarioArray;
								
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
    @FXML private Text lbSexo;
    @FXML private Button btnCadastrar;
    @FXML private Button btnSair;
    @FXML private ImageView imgLogo;
    @FXML private RadioButton radioMasc;
    @FXML private RadioButton radioFem;
    private String sexo;
    @FXML private AnchorPane rootPane;
    @FXML
    
    void cadastrarClick(ActionEvent event) {
    	
    	ControleCadastro controleCad = new ControleCadastro();
    	
    	Usuario novoUser = new Usuario();
    	
    	novoUser.setLogin(txtLogin.getText());
    	novoUser.setSenha(txtSenha.getText());
    	novoUser.setNome(txtNome.getText());
    	novoUser.setCpf(txtCpf.getText());
    	
    	if(radioMasc.isSelected()) {
    		sexo = "M";
    		
    		
    	} else if(radioFem.isSelected()) {
    		sexo = "F";
    	}
    	novoUser.setSexo(sexo);
    	
    	System.out.println(controleCad.AdicionaUsuario(novoUser));
    	System.out.println(novoUser);
    	
    	//System.out.println(novoUser.getCpf());
    	
    	
     }
    
    
    void fecharTela() {
    	CadastroController.getStage().close();
    }
    
    

	@Override
	public void start(Stage stage) throws Exception {

		 AnchorPane root =  FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
		 Scene scene = new Scene(root, 700, 500);
		
		//radioMasc.isSelected();
		 
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

	

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		btnSair.setOnMouseClicked((MouseEvent mouse) -> {
			fecharTela();
		});
		
			 
	}
	
	
	public static void main(String args[]) {

		launch(args);
	}
}
