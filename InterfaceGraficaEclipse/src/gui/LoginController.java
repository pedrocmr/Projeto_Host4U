package gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Usuario;
import repositorio.RepositorioUsuarioArray;

public class LoginController extends Application{
	
	private static Stage stage;
	
	@FXML private TextField txtLogin;
	@FXML private  PasswordField txtSenha;
    @FXML private Button btEntrar;
    @FXML private Button btSair;
    @FXML private Button btCadastro;

	private BufferedReader br;
    
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
		
		try {
			cadastro.start(new Stage());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public boolean proximaTelaHomeLogado(Usuario usuario) {
		
		HomeController home = new HomeController();
		fechaTela();
		//home.btCadastrar.setDisable(true);

		try {
			
			home.start(new Stage());
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		return true; 
	}

	private void fechaTela() {
		
		LoginController.getStage().close();
	}
	  
	@FXML
    void KeyEntrar(KeyEvent event) {
		
		if(event.getCode().equals(KeyCode.ENTER)) {
			
			String msg = "";
			
			if(txtLogin.getText().length() < 4 || txtSenha.getText().length() < 8) {
				
				msg += "Login ou senha muito pequenos \n";
				
			}else {
			
				try {
					boolean logou = false;
					File arquivo = new File ("src/arquivo.txt");
					FileReader fr = new FileReader(arquivo);
					br = new BufferedReader(fr);
					String linha = br.readLine();
					
					do{
						
						String [] vamosPorPartes = linha.split(",");
						
						if(vamosPorPartes[0].equals(txtLogin.getText()) && (vamosPorPartes[1].equals(txtSenha.getText()))) {
							
							logou = true;
							
							Usuario passaPraHome = new Usuario(vamosPorPartes[0],vamosPorPartes[1],vamosPorPartes[2],
																vamosPorPartes[3],vamosPorPartes[4]);
								proximaTelaHomeLogado(passaPraHome);
							
						}
						
						if(linha != null) {
							
							linha = br.readLine();
						}
						
					}while(linha != null);
					
					if(!logou) {
						
						msg += "Usuario nao cadastrado";
					}
					
				} catch (IOException e) {
					
					e.printStackTrace();
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
	
	private void proximaTelaHome() {
		
		HomeController home = new HomeController();
		
		fechaTela();
		
		try {

			home.start(new Stage());
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@FXML
    void ActionSair(ActionEvent event) {
		
		proximaTelaHome();
		fechaTela();
				
    }
	
	@FXML
    void keySair(KeyEvent event) {
		
		if(event.getCode().equals(KeyCode.ENTER)) {
			
			proximaTelaHome();
			fechaTela();	
		}
    }
	
	 @FXML
	    void clickEntrar(MouseEvent event) {

		 	String msg = "";
			
			if(txtLogin.getText().length() < 4 || txtSenha.getText().length() < 8) {
				
				msg += "Login ou senha muito pequenos \n";
				
			}else {
			
				try {
					boolean logou = false;
					File arquivo = new File ("src/arquivo.txt");
					FileReader fr = new FileReader(arquivo);
					br = new BufferedReader(fr);
					String linha = br.readLine();
					
					do{
						
						String [] vamosPorPartes = linha.split(",");
						
						if(vamosPorPartes[0].equals(txtLogin.getText()) && (vamosPorPartes[1].equals(txtSenha.getText()))) {
							
							logou = true;
							
							Usuario passaPraHome = new Usuario(vamosPorPartes[0],vamosPorPartes[1],vamosPorPartes[2],
																vamosPorPartes[3],vamosPorPartes[4]);
							
							proximaTelaHomeLogado(passaPraHome);
							
						}
						
						if(linha != null) {
							
							linha = br.readLine();
						}
						
					}while(linha != null);
					
					if(!logou) {
						
						msg += "Usuario nao cadastrado";
					}
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				
				
			}if(msg.length() != 0) {
				
				Alert erro = new Alert(AlertType.ERROR);
				erro.setTitle("Campos inválidos");
				erro.setHeaderText("Por favor, tente novamente.");
				erro.setContentText(msg);
				erro.showAndWait();
		
			}
	 }
	 @FXML
	    void clickCadastro(MouseEvent event) {

		 	proximaTelaCadastro();
		 	fechaTela();
	    }

    @FXML
	    void keyCadastro(KeyEvent event) {
    		
    		if(event.getCode().equals(KeyCode.ENTER)) {
    			
    			proximaTelaCadastro();
    		 	fechaTela();
    		}
	    }
	 
	public static void main(String[ ] args) {
		
		launch(args);
	}
}
