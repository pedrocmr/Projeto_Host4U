package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TelaCadastro extends Application  {

	private TextField txLogin;
	private PasswordField txSenha;
	private TextField txNome;
	private TextField txSexo;
	
	
	public static void main(String[] args) {
		launch(args);  

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Image img = new Image("imagens/iconehotel.png");
		primaryStage.setTitle("Cadastro");
		primaryStage.getIcons().add(img);
		
		Group root = new Group();
		Scene scene = new Scene(root, 600 ,400);
		
		Button btn_cadastrar = new Button("Cadastrar");
		Label lb_cadastrar = new Label("Cadastrar Usu�rio");
		
		txLogin = new TextField();
		txLogin.setPromptText("login");
		txLogin.setLayoutX(220);
		txLogin.setLayoutY(100);
		
		txSenha = new PasswordField();
		txSenha.setPromptText("senha");
		txSenha.setLayoutX(220);
		txSenha.setLayoutY(130);
		
		txNome = new TextField();
		txNome.setPromptText("nome");
		txNome.setLayoutX(220);
		txNome.setLayoutY(160);
		
		txSexo = new TextField();
		txSexo.setPromptText("sexo");
		txSexo.setLayoutX(220);
		txSexo.setLayoutY(190);
		
		
		btn_cadastrar.setLayoutX(260);
		btn_cadastrar.setLayoutY(220);
		
		lb_cadastrar.setLayoutX(250);
		lb_cadastrar.setLayoutY(50);
		
		btn_cadastrar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				lb_cadastrar.setText("Bot�o cadastrar pressionado");
				
			}
		});
		
		root.getChildren().addAll(txLogin,txSenha, txNome, txSexo,btn_cadastrar, lb_cadastrar);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	

}