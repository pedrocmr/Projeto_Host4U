import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class H4ULoginAPP extends Application{
	
	private double alturaPane = 600; //aqui ficam todas as variaveis, (estão aqui para serem globais)
	private double larguraPane = 400;
	private Button btEntrar;
	private Button btSair;
	private AnchorPane pane;
	private static Stage stage;
	private TextField txLogin;
	private PasswordField txSenha;
	private Image iconeTitulo;
	
	
	public void start (Stage stage) throws Exception {
		
		initComponentes();
		
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.getIcons().add(iconeTitulo);
		stage.setResizable(false); //faz com que nao possa redimensionar a tela, se puder, vai deslocar os lugares do botoes
		stage.show();
		
		initLayout();
		
		H4ULoginAPP.stage = stage;
	}
	
	private void initComponentes() { //metodo para inicializar os componentes
		
		pane = new AnchorPane();
		pane.setPrefSize(larguraPane, alturaPane);
		pane.setStyle("-fx-background-image: url(/imagens/fundoRDM.jpg)");
		
		
		txLogin = new TextField();
		txLogin.setPromptText("Usuário");
		txSenha = new PasswordField();
		txSenha.setPromptText("Senha");
		
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");
		
		iconeTitulo = new Image(getClass().getResourceAsStream("/imagens/iconehotel.png"));
		
		
		pane.getChildren().addAll(txLogin,txSenha,btEntrar,btSair);
	}
	
	
	private void initLayout(){	//inicia o lugar dos componentes na tela
		
		btEntrar.setLayoutX(larguraPane/2-15);
		btEntrar.setLayoutY(alturaPane/2+10);
		btSair.setLayoutX(larguraPane/2-9);
		btSair.setLayoutY(alturaPane/2+50);
		
		txSenha.setLayoutX(larguraPane/2-67);
		txSenha.setLayoutY(alturaPane/2-25);
		txLogin.setLayoutX(larguraPane/2-67);
		txLogin.setLayoutY(alturaPane/2-57);
		
	}
	
	private void initAcoes() {
		
		
	}
	
	public static void main (String [] args) {
		
		launch(args);
	}

}
