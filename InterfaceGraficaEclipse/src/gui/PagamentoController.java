package gui;

import java.net.URL;
import java.util.ResourceBundle;

import controlador.ControlePagamento;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PagamentoController extends Application implements Initializable {

	ControlePagamento cp;
	private static Stage stage;

	@FXML private AnchorPane root;
    @FXML private ImageView imagem;
    @FXML private Label lbNumero;
    @FXML private TextField txNumero;
    @FXML private TextField txTitular;
    @FXML private TextField txCpf;
    @FXML private Label lbTitular;
    @FXML private Label lbCvv;
    @FXML private Label lbCpf;
    @FXML private Label lbParcelas;
    @FXML private MenuButton btParcelas;
    @FXML private TextField txCvv;
    @FXML private Button btFinalizar;
    @FXML private Button btVoltar;
    @FXML private Label lbTitulo;
	
	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane root = FXMLLoader.load(getClass().getResource("/gui/Pagamento.fxml"));

		Scene scene = new Scene(root, 600, 500);

		stage.setTitle("HOST4U - Pagamento");
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
		PagamentoController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {
     
		btFinalizar.setOnMouseClicked((MouseEvent mouse) -> {
				System.out.println("Aprovado!");
		});
		
		btFinalizar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				System.out.println("Aprovado!");
			}
		});
		
		btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaTela();
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaTela();
			}
		});
	}

	public void fecharTela() {
		PagamentoController.getStage().close();
	}
	
	public void proximaTela() {
		
		ReservaController r = new ReservaController();
		fecharTela();
		
		try {
			r.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	public static void main(String[] args) {

		launch(args);
	}

}
