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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import repositorio.RepositorioHotelArray;

public class RelatorioAdminController extends Application implements Initializable{
	
	public static Stage stage;
	RepositorioHotelArray repoHoteis;
	
	@FXML private AnchorPane root;
    @FXML private ChoiceBox<?> mnHotel;
    @FXML private Text txHotel1;
    @FXML private Text txInicio;
    @FXML private Text txFim;
    @FXML private Button btGeraRelatorio;
    @FXML private DatePicker dtInicio;
    @FXML private DatePicker dtFim;
    @FXML private Text txTitulo;
    @FXML private Text txHotel2;
    @FXML private ChoiceBox<?> mnHotel2;
    @FXML private Button btRelatorioGeral;
    @FXML private ImageView imagem;
    @FXML private Button btVoltar;

    @FXML
    void geraRelatorio(ActionEvent event) {

    	btGeraRelatorio.setOnMouseClicked((MouseEvent mouse) -> {
			System.out.println("geraaaaa");
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
			System.out.println("geraaaaa");	
			}
		});
    }

    @FXML
    void relatorioGeral(ActionEvent event) {

    	btRelatorioGeral.setOnMouseClicked((MouseEvent mouse) -> {
           System.out.println("ola");
    	});
		
		btRelatorioGeral.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				System.out.println("ola");
				
			}
		});
    }

    @FXML
    void voltar(ActionEvent event) {

		btVoltar.setOnMouseClicked((MouseEvent mouse) -> {
			proximaHome();
		});
		
		btVoltar.setOnKeyPressed((KeyEvent enter) -> {
			if(enter.getCode().equals(KeyCode.ENTER)) {
				proximaHome();
				
			}
		});
    }
	
	@Override
	public void start(Stage stage) throws Exception {

		AnchorPane root = FXMLLoader.load(getClass().getResource("/gui/RelatorioAdmin.fxml"));
		Scene scene = new Scene(root, 700, 500);
		
		stage.setScene(scene);

		stage.setTitle("HOST4U - Relatório");
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
		RelatorioAdminController.stage = stage;
	}
	
	
	public static void main(String args[]) {
		launch(args);
	}
	
	public void fechaTela() {
		RelatorioAdminController.getStage().close();
	}
	public void listarHoteis() {
		repoHoteis.listarHoteis();
	}

	public void proximaHome() {
		HomeController hc = new HomeController();
		fechaTela();
		
		try {
			hc.start(new Stage());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void initialize(URL location, ResourceBundle resources) {
		//PREENCHER
	}

}
