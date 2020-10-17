package gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class H4UMeuPerfilAPP extends Application {

	private TextField txLogin;
	private PasswordField txSenha;
	private TextField txNome;
	private TextField txSexo;

	public static void main(String args[]) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// CRIANDO LAYOUT
		Group layout = new Group();
		Scene scene = new Scene(layout, 700, 550);

		// COLOCANDO TÍTULO
		primaryStage.setTitle("HOST4U - Meu Perfil");

		// COLOCANDO TEXTOS
		Text titulo = new Text("MEU PERFIL");
		titulo.setLayoutX(10);
		titulo.setLayoutY(70);
		titulo.setFont(new Font("Comic Sans MS", 24));
		layout.getChildren().add(titulo);

		Text texto1 = new Text("Nome:");
		texto1.setLayoutX(200);
		texto1.setLayoutY(130);
		layout.getChildren().add(texto1);

		Text texto2 = new Text("Login:");
		texto2.setLayoutX(200);
		texto2.setLayoutY(190);
		layout.getChildren().add(texto2);

		Text texto3 = new Text("Senha:");
		texto3.setLayoutX(200);
		texto3.setLayoutY(250);
		layout.getChildren().add(texto3);

		Text texto4 = new Text("Sexo:");
		texto4.setLayoutX(210);
		texto4.setLayoutY(310);
		layout.getChildren().add(texto4);
		
		Label lb_reserva = new Label("Minhas Reservas:");
		lb_reserva.setFont(new Font("Arial Black",20));
		lb_reserva.setLayoutX(435);
		lb_reserva.setLayoutY(95);
		layout.getChildren().add(lb_reserva);

		// INICIALIZANDO CAIXA DE TEXTO
		txNome = new TextField();
		txNome.setPrefWidth(210);
		txNome.setPromptText("Nome");
		txNome.setLayoutX(200);
		txNome.setLayoutY(140);

		txLogin = new TextField();
		txLogin.setPrefWidth(210);
		txLogin.setPromptText("Login");
		txLogin.setLayoutX(200);
		txLogin.setLayoutY(200);

		txSenha = new PasswordField();
		txSenha.setPrefWidth(210);
		txSenha.setPromptText("Senha");
		txSenha.setLayoutX(200);
		txSenha.setLayoutY(260);

		txSexo = new TextField();
		txSexo.setPrefWidth(210);
		txSexo.setPromptText("Sexo");
		txSexo.setLayoutX(200);
		txSexo.setLayoutY(320);

		// INICIALIZANDO IMAGE E ADICIONANDO ICONE
		Image imagem = new Image("imagens/iconehotel.png");
		primaryStage.getIcons().add(imagem);
		
		ImageView imagem1 = new ImageView("imagens/PerfilAzul.png");
		imagem1.setLayoutX(10);
		imagem1.setLayoutY(100);
		imagem1.fitHeightProperty().set(145);
		imagem1.fitWidthProperty().set(155);
		
		// INICIALIZANDO BOTÃO
		Button botao = new Button("Concluir");
		botao.setLayoutX(310);
		botao.setLayoutY(500);
		
		//RETANGULO
		Rectangle retangulo = new Rectangle(430,90,250,330);
        retangulo.setFill(null);
        retangulo.setStroke(Color.BLACK);
        
		
		// ADICIONANDO ELEMENTOS NA TELA
		layout.getChildren().addAll(botao, txNome, txLogin, txSenha, txSexo, imagem1 , retangulo);

		// GERANDO TELA
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
