package gui;

import java.net.URL;
import java.util.ResourceBundle;

import controlador.ControleCadastro;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
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
    
    public  CadastroController() {
		// TODO Auto-generated constructor stub
	}
    @FXML
    
    void cadastrarClick(ActionEvent event) {
    	
    	ControleCadastro controleCad = new ControleCadastro();
    	RepositorioUsuarioArray repArray = new RepositorioUsuarioArray();
    	
    	if(radioMasc.isSelected()) {
    		sexo = "M";
    		
    		
    	} else if(radioFem.isSelected()) {
    		sexo = "F";
    	}
    	
    	if(txtLogin.getText().length() < 5 || txtNome.getText().length() < 3 || txtSenha.getText().length() < 8 || txtCpf.getText().length() < 11 ) {
    		Alert erro = new Alert(AlertType.ERROR);
			erro.setTitle("Erro!");
			erro.setHeaderText("Por favor, verifique se podem ser essas opções: ");
			erro.setContentText("Algum campo com tamanho inferior ao permitido! "
					+ "Letras no campo do CPF!");
			erro.showAndWait();
			
    	}
    	else {
    		
    		if(controleCad.adicionaUsuario(new Usuario(txtLogin.getText(), txtSenha.getText(), txtNome.getText(), txtCpf.getText(), sexo)) == true) 
    		{
    			
    			Alert erro = new Alert(AlertType.INFORMATION);    			
    			erro.setTitle("Parabéns");
    			erro.setHeaderText("");
    			erro.setContentText("Cadastrado Com Sucesso!");
    			erro.showAndWait();
    			proximaHome();
    		
    		} else {
    			Alert erro = new Alert(AlertType.INFORMATION);
    			erro.setTitle("Erro!");
    			erro.setHeaderText("Por favor, verifique se há ocorre algum destes casos: ");
    			erro.setContentText("Usuário já existe! "
    					+ "O campo CPF não pode conter letras.");
    			erro.showAndWait();
    		}
    	}
    	
    	
    	  	
     }
    
    
    void fecharTela() {
    	CadastroController.getStage().close();
    }
    
    public void proximaHome() {
		HomeController hC = new HomeController();
		fecharTela();
		
		try {
			hC.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
    
    
    
    

	@Override
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

	

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		btnSair.setOnMouseClicked((MouseEvent mouse) -> {
			HomeController hC = new HomeController();
			fecharTela();
			try {
				hC.start(new Stage());
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		
			 
	}
	
	
	public static void main(String args[]) {

		launch(args);
	}
}
