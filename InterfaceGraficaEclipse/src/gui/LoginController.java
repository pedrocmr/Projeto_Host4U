package gui;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginController extends Application {

	private double alturaPane = 600;
	private double larguraPane = 400;
	private Button btEntrar;
	private Button btSair;
	private AnchorPane pane;
	private static Stage stage;
	private TextField txLogin;
	private PasswordField txSenha;
	private Image iconeTitulo;

	public void start(Stage stage) throws Exception {

		initComponentes();
		initAcoes();

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.getIcons().add(iconeTitulo);
		stage.setResizable(false);
		stage.show();

		initLayout();

		LoginController.stage = stage;
	}

	private void initComponentes() {

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

		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
	}

	private void initLayout() { // inicia o lugar dos componentes na tela

		btEntrar.setLayoutX(larguraPane / 2 - 15);
		btEntrar.setLayoutY(alturaPane / 2 + 10);
		btSair.setLayoutX(larguraPane / 2 - 9);
		btSair.setLayoutY(alturaPane / 2 + 50);

		txSenha.setLayoutX(larguraPane / 2 - 67);
		txSenha.setLayoutY(alturaPane / 2 - 25);
		txLogin.setLayoutX(larguraPane / 2 - 67);
		txLogin.setLayoutY(alturaPane / 2 - 57);

	}

	private void initAcoes() { // inicia as acoes de componetentes

		btEntrar.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				logar();

			}
		});

		btSair.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {

				fecharAplicacao();

			}
		});
	}

	private void fecharAplicacao() {

		System.exit(0);
	}

	private void logar() {// aqui fica todas as configs de login, como validacao, nao sei se aqui fica a
							// parte de adicionar novos user tb

		if (txLogin.getText().equals("administrador") && txSenha.getText().equals("12345")) {

			// parte em que vai pra tela inicial com permissoes de admin (falta implementar)

		} else {

			JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {

		launch(args);
	}

}
