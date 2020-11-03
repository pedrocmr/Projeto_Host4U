package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MeuPerfilController extends Application implements Initializable{

		static Stage stage;
	
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
	    @FXML private Button btReservas;
     
	    @FXML
	    void salvarAlteracoes(ActionEvent event) {

	       File arquivo = new File("src/arquivo.txt");
	       FileWriter fileWriter;
	       FileReader fileReader;
	       BufferedReader leitor;
	       BufferedWriter escrever;
	     
	       String linha;
	       String loginNew = txLogin.getText();
	      
	       try {
	    	   
	    		fileReader = new FileReader(arquivo);
				leitor = new BufferedReader(fileReader);
				 linha = leitor.readLine();
				 fileWriter = new FileWriter(arquivo,true);
				 escrever = new BufferedWriter(fileWriter);
				
	    	   
			   do {
					
				   String [] vamosPorPartes = linha.split(","); 
				
					if (loginNew.equals(vamosPorPartes[0])) { //se achei esse login no arquivo						
						
					  String linhaDados = loginNew +  "," + vamosPorPartes[1] + "," + vamosPorPartes[2] + "," + vamosPorPartes[3] + "," + vamosPorPartes[4];
					 vamosPorPartes[2] =  txNome.getText();
					 vamosPorPartes[1] = txSenha.getText();
					 vamosPorPartes[4] = txSexo.getText();
					 linhaDados = loginNew +  "," + vamosPorPartes[1] + "," + vamosPorPartes[2] + "," + vamosPorPartes[3] + "," + vamosPorPartes[4];

				      escrever.write(linhaDados + "\n");
				      escrever.close();
					   fileWriter.close();	 
				    	  
					}else {
						Alert erro = new Alert(AlertType.ERROR);
						erro.setTitle("Não tem como mudar");
						erro.setHeaderText("O Login deve ser o mesmo.");
						erro.setContentText("Erro");
						erro.showAndWait();
					}
					
					if (linha != null) {
						
						linha = leitor.readLine();
						
						
					}
					
				}while(linha != null);
				
			 
			  
		  } catch (IOException e) {
			    System.out.println("Esse login já existe!");
			}
			
			
	    }

	    @FXML
	    void verReservas(ActionEvent event) {

	    	btReservas.setOnMouseClicked((MouseEvent mouse) -> {
				proximaTela();
			});
			
			btReservas.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
	                 proximaTela();
			     }
		    });
	    }

	    @FXML
	    void voltar(ActionEvent event) {

	    	btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
				telaHome();
			});
			
			btVoltar.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					telaHome();
				}
			});
	    }
	    
	@Override
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("MeuPerfil.fxml"));
		Scene scene = new Scene(root, 700, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Meu Perfil");
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
		MeuPerfilController.stage = stage;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
    public void fecharTela() {
	MeuPerfilController.getStage().close();
}
    
    public void telaHome() {
    	
    	HomeController hc = new HomeController();
		fecharTela();
		
		try {
			hc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    public void proximaTela() {
	
	MinhaReservaController rc = new MinhaReservaController();
	fecharTela();
	
	try {
		rc.start(new Stage());
	} catch (Exception e) {
		// TODO: handle exception
	}
}
	
	public static void main(String args[]) {

		launch(args);

	}

}
