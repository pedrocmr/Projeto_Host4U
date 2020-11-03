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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import modelo.Hotel;
import modelo.Usuario;
import repositorio.RepositorioHotelArray;


public class TabelaController extends Application implements Initializable{

	private static Stage stage;
	
	@FXML private AnchorPane root;
    @FXML private TableView<Hotel> tabela;
    @FXML private TableColumn<Hotel, String> clnNome;
    @FXML private TableColumn<Hotel, Integer> clnQuartos;
    @FXML private TableColumn<Hotel, String> clnEndereço;
    @FXML private Button btVoltar;
    @FXML private Text txtTitulo;
    @FXML private Button btAvancar;
    @FXML private ImageView imagem;
    
    private Usuario usuario;
    
    public TabelaController(Usuario usuario) {
    	
    	this.usuario = usuario;
	}

    @FXML
    void avancaTela(ActionEvent event) {
    	
    	btAvancar.setOnMouseClicked((MouseEvent mouse) -> {
    		if(tabela.getSelectionModel().getSelectedItem() != null) {
			        telaReserva();
    		}
		});
    
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
		
		AnchorPane root = FXMLLoader.load(getClass().getResource("Tabela.fxml"));
		Scene scene = new Scene(root, 735, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Hotéis");
		Image imagem = new Image("imagens/iconehotel.png");
		stage.getIcons().add(imagem);

		// GERANDO TELA
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
		
		setStage(stage);
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		inicializaTabela();
	}
	
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		TabelaController.stage = stage;
	}
	
	public void fecharTela() {
		TabelaController.getStage().close();
	}
	
	public void proximaTela() {
		
		HomeController hc = new HomeController();
		fecharTela();
		
		try {
			hc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void telaReserva() {
		
		ReservaController rc = new ReservaController(usuario);
		fecharTela();
		
		try {
			rc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
   public void inicializaTabela() {
		
		clnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		clnQuartos.setCellValueFactory(new PropertyValueFactory<>("qtdQuartos"));
		clnEndereço.setCellValueFactory(new PropertyValueFactory<>("endereco"));
		
		tabela.setItems(listaTabela());
		
	}
   
   public ObservableList<Hotel> listaTabela(){
		RepositorioHotelArray rH = new RepositorioHotelArray();
		return FXCollections.observableArrayList(rH.listarHoteis());
	}
   
  
	public static void main(String[] args) {

		launch(args);
	}

	

}
