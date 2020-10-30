package gui;

import java.net.URL;
import java.util.ResourceBundle;

import controlador.ControlePagamento;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Pagamento;

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
    @FXML private MenuItem mnItem1;
    @FXML private MenuItem mnItem2;
    @FXML private MenuItem mnItem3;
    @FXML private MenuItem mnItem4;
    @FXML private MenuItem mnItem5;
    @FXML private MenuItem mnItem6;
    
    @FXML
    void selecionaParcela(ActionEvent event) {
     
		Pagamento p = new Pagamento();
		ControlePagamento cp = new ControlePagamento(p);

		for (int i = 0; i <= 6; i++) {

			int x = i;
			btParcelas.setOnAction(Event -> {

				if (x == 1) {
					btParcelas.setText(mnItem1.getText() + cp.totalPagamento());
				}
				if (x == 2) {
					btParcelas.setText(mnItem2.getText() + cp.totalPagamento() / 2);
				}
				if (x == 3) {
					btParcelas.setText(mnItem3.getText() + cp.totalPagamento() / 3);
				}
				if (x == 4) {
					btParcelas.setText(mnItem4.getText() + cp.totalPagamento() / 4);
				}
				if (x == 5) {
					btParcelas.setText(mnItem5.getText() + cp.totalPagamento() / 5);
				}
				if (x == 6) {
					btParcelas.setText(mnItem6.getText() + cp.totalPagamento() / 6);
				}
			
			});
		}

	}
    
	@FXML
	void finaliza(ActionEvent event) {

		Pagamento p = new Pagamento();
		ControlePagamento cp = new ControlePagamento(p);

		if (txNumero.getText().length() != 16 || txTitular.getText().length() < 6 || txCpf.getText().length() != 11
				|| txCvv.getText().length() != 3 || btParcelas.getText().equals("Escolha a quantidade de parcelas")) {
			Alert erro = new Alert(AlertType.ERROR);
			erro.setTitle("Erro!");
			erro.setHeaderText("Por favor, verifique se podem ser essas opções: ");
			erro.setContentText("Algum campo com tamanho inferior ao permitido!" + " ou " + "Campo de parcelas não selecionado");
			erro.showAndWait();

		}

		else {

			Alert erro = new Alert(AlertType.INFORMATION);
			erro.setTitle("Aprovado!");
			erro.setContentText("Pagamento Aprovado com Sucesso!");
			erro.showAndWait();

			proximaMinhaReserva();

		}

	}

    @FXML
    void voltar(ActionEvent event) {

    	btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaTela();
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaTela();
			}
		});
    }
    
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

		//PREENCHER;
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
	
	public void proximaMinhaReserva() {

		MinhaReservaController mrc = new MinhaReservaController();
		fecharTela();

		try {
			mrc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

	
	public static void main(String[] args) {

		launch(args);
	}

}
