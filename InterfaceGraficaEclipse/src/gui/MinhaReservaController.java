package gui;

import java.net.URL;
import java.time.LocalDate;
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
import javafx.stage.Stage;
import modelo.Quarto;
import modelo.Reserva;
import modelo.Usuario;
import repositorio.RepositorioReservaArray;

public class MinhaReservaController extends Application implements Initializable {

		private static Stage stage;
	
	    @FXML private AnchorPane root;
	    @FXML private TableView<Reserva> tabela;
	    @FXML private TableColumn<Reserva, Usuario> rotuloNome;
	    @FXML private TableColumn<Reserva, Quarto> rotuloHotel;
	    @FXML private TableColumn<Reserva, Quarto> rotuloQuarto;
        @FXML private TableColumn<Reserva, LocalDate> rotuloCheckin;
	    @FXML private TableColumn<Reserva, LocalDate> rotuloCheckout;
        @FXML private ImageView imagem;
	    @FXML private Button btSalvar;
	    @FXML private Button btVoltar;
	
	    @FXML
	    void salvarAlteracao(ActionEvent event) {

	    	btSalvar.setOnMouseClicked((MouseEvent mouse) -> {
				System.out.println("salvo!");
			});
			
			btSalvar.setOnKeyPressed((KeyEvent enter) -> {
				if(enter.getCode().equals(KeyCode.ENTER)) {
					System.out.println("salvo");
				}
			});
	    }

	    @FXML
	    void voltarTela(ActionEvent event) {

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

		// CRIANDO LAYOUT
		AnchorPane root = FXMLLoader.load(getClass().getResource("MinhaReserva.fxml"));
		Scene scene = new Scene(root, 700, 500);

		// COLOCANDO TÍTULO
		stage.setTitle("HOST4U - Minhas Reservas");
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
		MinhaReservaController.stage = stage;
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		
		inicializaTabela();
	}
	
	public void inicializaTabela() {
		
		rotuloNome.setCellValueFactory(new PropertyValueFactory<>("usuario.getNome()"));
		rotuloHotel.setCellValueFactory(new PropertyValueFactory<>("quarto.getHotel().getNome()"));
		rotuloQuarto.setCellValueFactory(new PropertyValueFactory<>("usuario.getNome()"));
		rotuloCheckin.setCellValueFactory(new PropertyValueFactory<>("checkin"));
		rotuloCheckout.setCellValueFactory(new PropertyValueFactory<>("checkout"));
	}
	
	public ObservableList<Reserva> listaTabela(){
		RepositorioReservaArray rr = new RepositorioReservaArray();
		Usuario user = new Usuario();
		return FXCollections.observableArrayList(rr.listarReservas(user.getCpf()));
	}
	
	public void fecharTela() {
		MinhaReservaController.getStage().close();
	}
	
	public void proximaTela() {
		
		MeuPerfilController mp = new MeuPerfilController();
		fecharTela();
		
		try {
			mp.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
