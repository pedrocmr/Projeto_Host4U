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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Usuario;

public class MeuPerfilController extends Application implements Initializable{

		static Stage stage;
	
	    @FXML private AnchorPane root;
        @FXML private Label texto6;
        @FXML private Label texto2;
        @FXML private Label texto4;
        @FXML private Label texto3;
	    @FXML private Label texto5;
	    @FXML public TextField txNome;
	    @FXML public TextField txSexo;
	    @FXML public TextField txLogin;
	    @FXML private Button btSalvar;
	    @FXML private ImageView imagem1;
	    @FXML private Button btVoltar;
	    @FXML public PasswordField txSenha;
	    @FXML private ImageView imagemHost;
	    @FXML private Button btReservas;
     
	    @FXML
	    void salvarAlteracoes(ActionEvent event) {

	    	btSalvar.setOnMouseClicked((MouseEvent mouse) -> {
				System.out.println("salvo!");
			});
			 
			btSalvar.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					System.out.println("salvo!");
				}
			});
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
		//PREENCHER
		Usuario user = new Usuario("rafael0607", "12345678", "Rafaellindo", "23344378956", "M");
		/*txLogin.setText(user.getLogin());
		txNome.setText(user.getNome());
		txSenha.setText(user.getSenha());
		txSexo.setText(user.getSexo());*/
		
		
		
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
