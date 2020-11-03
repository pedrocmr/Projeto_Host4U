package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Usuario;

public class HomeController extends Application implements Initializable {

	private static Stage stage;

	@FXML private AnchorPane root;
    @FXML private ImageView imagem;
    @FXML private Label lbTitulo;
    @FXML private Label lbSlogan;
    @FXML private Label lbPesquisa;
    @FXML private TextField txHotel;
    @FXML private ImageView imagemPg;
    @FXML private ImageView imagemTm;
    @FXML public Button btCadastrar;
    @FXML public Button btLogin;
    @FXML private Text txtNome;
    @FXML private Text txtAviso;
    @FXML private Button btBoa;
    @FXML private Button btTam;
    @FXML private Button btPort;
    @FXML private ImageView imagemBv;
    @FXML private Button btMeuPerfil;
    	  private Usuario usuario;
    	  
    public HomeController(Usuario usuario) {
    	
    	this.usuario = usuario;
    	
    }
    
    public HomeController() {
    	
    	usuario = null;
    }
    
    @FXML
    void actionMeuPerfil(ActionEvent event) {

    	btMeuPerfil.setOnMouseClicked((MouseEvent mouse) -> {
			
    		proximaPerfil();
			
		});
		
		btMeuPerfil.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				
				proximaPerfil();
					
			}
		});
    
    }
    @FXML
    void tabelaBv(MouseEvent event) {
        proximaTabela();
    }

    @FXML
    void tabelaPg(MouseEvent event) {
      proximaTabela();
    }

    @FXML
    void tabelaTm(MouseEvent event) {
      proximaTabela();
    }
    

	    @FXML
	    void logar(ActionEvent event) {

	    	btLogin.setOnMouseClicked((MouseEvent mouse) -> {
				proximaLogin();
			});
			
			btLogin.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					proximaLogin();
				}
			});
	    }
	    
	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane root;
		
		if(usuario == null) {
			
			root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		}else {
			
			root = FXMLLoader.load(getClass().getResource("HomeLogado.fxml"));
		}

		Scene scene = new Scene(root, 700, 500);
		
		
		stage.setTitle("HOST4U - Home");
		Image imagem = new Image("imagens/iconehotel.png");
		stage.getIcons().add(imagem);
		
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();

		setStage(stage);

	}

	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		HomeController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {
		

	}
	
	
	public void fecharTela() {
		HomeController.getStage().close();
	}
	
	public void proximaPerfil() {
		
		MeuPerfilController mpc = new MeuPerfilController();
		fecharTela();
		
		try {
			mpc.start(new Stage());
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
	
	public void proximaTabela() {
		
		TabelaController tc = new TabelaController();
		fecharTela();
		
		try {
			tc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	public static void main(String[] args) {
		
		launch(args);
	}

}
