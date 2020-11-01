package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import modelo.Hotel;
import modelo.Quarto;

public class ReservaController extends Application implements Initializable {

	    private static Stage stage;

	    @FXML private AnchorPane root;
	    @FXML private ImageView imagem;
	    @FXML private Label lbTitulo;
	    @FXML private Label lbEntrada;
	    @FXML private DatePicker dtCheckIn;
	    @FXML private DatePicker dtCheckOut;
	    @FXML private Label lbSaida;
	    @FXML private Label lbPessoas;
	    @FXML private Label lbQuartos;
	    @FXML private MenuButton menuPessoas;
	    @FXML private MenuButton menuQuartos;
	    @FXML private RadioButton rdViajar;
	    @FXML private Button btConfirmar;
	    @FXML private Button btVoltar;
	    @FXML private TableView<Quarto> tabela;
	    @FXML private TableColumn<Quarto, Integer> clnNumQuarto;
	    @FXML private TableColumn<Quarto, Integer> clnNumCamas;
	    @FXML private TableColumn<Quarto, Integer> clnAndar;
	    @FXML private TableColumn<Quarto, Double> clnValor;
	    
	    @FXML void confirmaReserva(ActionEvent event) {

	    	btConfirmar.setOnMouseClicked((MouseEvent mouse) -> {
				proximaTela();
			});
			
			btConfirmar.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					proximaTela();
				}
			});
	    }

	    @FXML
	    void voltarTela(ActionEvent event) {

	    	btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
				proximaTabela();
			});
			
			btVoltar.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					proximaTabela();
					
				}
			});
	    }
	    
	public void start(Stage stage) throws Exception {

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("Reserva.fxml"));
		Scene scene = new Scene(root, 700, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Reserva");
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
		ReservaController.stage = stage;
	}

	public void initialize(URL location, ResourceBundle resources) {
		inicializaTabela();
	}

	public void fecharTela() {
		ReservaController.getStage().close();
	}
	
	public void proximaTela() {
		
		PagamentoController p = new PagamentoController();
		fecharTela();
		
		try {
			p.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void proximaTabela() {
		TabelaControllerBV tc = new TabelaControllerBV();
		fecharTela();
		
		try {
			tc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
    public void inicializaTabela() {
		
		clnNumQuarto.setCellValueFactory(new PropertyValueFactory<>("numero"));
		clnNumCamas.setCellValueFactory(new PropertyValueFactory<>("numeroCamas"));
		clnAndar.setCellValueFactory(new PropertyValueFactory<>("andar"));
		clnValor.setCellValueFactory(new PropertyValueFactory<>("valorReserva"));
		
		tabela.setItems(listaTabela());
		
	}
    
    public ObservableList<Quarto> listaTabela(){
		Hotel rqa = new Hotel();
		return FXCollections.observableArrayList(rqa.getQuartos());
	}

	public static void main(String[] args) {
		launch(args);

	}

}
