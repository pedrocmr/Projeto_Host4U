package gui;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Usuario;
import repositorio.RepositorioUsuarioArray;

public class LoginController extends Application{
	
	private static Stage stage;
	
	@FXML
	private TextField txtLogin;
    
	@FXML
    private TextField txtSenha;

    @FXML
    private Button btEntrar;

    @FXML
    private Button btSair;

    @FXML
    private Button btCadastro;
    
    public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(root, 700, 500);

		
		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Login");
		Image imagem = new Image("imagens/iconehotel.png");
		stage.getIcons().add(imagem);
		
		// GERANDO TELA
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
		setStage(stage);

	}

	public static void setStage(Stage stage) {
		
		LoginController.stage = stage;	
		
	}
	public static Stage getStage() {
		
		return stage;
	}	
		
	private void proximaTelaCadastro() {
		
		CadastroController cadastro = new CadastroController();
		fechaTela();
		
	}

	private void proximaTelaLogin() {
		
		HomeController home = new HomeController();
		fechaTela();
	}

	private void fechaTela() {
		
		LoginController.getStage().close();
	}
	  
	@FXML
    void KeyEntrar(KeyEvent event) {
		
		if(event.getCode().equals(KeyCode.ENTER)) {
			
			RepositorioUsuarioArray repo = new RepositorioUsuarioArray();
			String msg = "";
			
			if(txtLogin.getText().length() < 6 || txtSenha.getText().length() < 8) {
				
				msg += "Login ou senha muito pequenos \n";
				
			}else {
			
			for (Usuario user : repo.getUsuarios()) {
				
				if(user.getLogin().equals(txtLogin.getText()) && (user.getSenha().equals(txtSenha.getText()))) {
					
					proximaTelaLogin();
					
				}
				
			}
		}
			
			if(msg.length() != 0) {
				
				Alert erro = new Alert(AlertType.ERROR);
				erro.setTitle("Campos inválidos");
				erro.setHeaderText("Por favor, tente novamente.");
				erro.setContentText(msg);
				erro.showAndWait();
			}
		}
	
		
	}
	
	public static void main(String[ ] args) {
		
		launch(args);
	}
    
}
