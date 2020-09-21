package view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Aula01 extends Application {
	
	public static void main(String[] args) {
		launch(args);
		
	}//fim do main

	@Override
	public void start(Stage primaryStage) throws Exception {
		Image imagem = new Image("imagens/iconehotel.png");
		primaryStage.setTitle("Host4U");
		primaryStage.getIcons().add(imagem);
		
		Group root  = new Group();
		Scene scene = new Scene(root, 800,640, Color.CADETBLUE); 
		
		Line blackLine = new Line(10,10,200,10);
		blackLine.setStroke(Color.BLACK);
		blackLine.setStrokeWidth(12);
		blackLine.setStrokeLineCap(StrokeLineCap.ROUND);
		root.getChildren().add(blackLine);
		
		Line redLine = new Line(10,40,200,40);
		redLine.setStroke(Color.RED);
		redLine.setStrokeWidth(12);
		redLine.setStrokeLineCap(StrokeLineCap.BUTT);
		redLine.getStrokeDashArray().addAll(10d);
		redLine.setStrokeDashOffset(0);
		root.getChildren().add(redLine);
		
		Line whiteLine = new Line(10,25,200,25);
		whiteLine.setStroke(Color.WHITE);
		whiteLine.setStrokeWidth(12);
		whiteLine.setStrokeLineCap(StrokeLineCap.ROUND);
		
		root.getChildren().add(whiteLine);
		
		
		Slider slider = new Slider(10,40,24);
		slider.setLayoutX(10);
		slider.setLayoutY(195);
		root.getChildren().add(slider);
		
		Text offsetText = new Text("Stroke Dash OffSet = "+ (int) slider.getValue());
		offsetText.setX(10);
		offsetText.setY(180);
		offsetText.setStroke(Color.WHITE);
		root.getChildren().add(offsetText);
		
		slider.valueProperty().
		addListener((ov, curVal, newValue)-> 
		offsetText.setText("Stroke Dash OffSet = "+ (int) slider.getValue()));
		redLine.strokeDashOffsetProperty().bind(slider.valueProperty());
		
		slider.valueProperty().
		addListener((ov, curVal, newValue)-> 
		offsetText.setFont(new Font(slider.getValue())));
		redLine.strokeDashOffsetProperty().bind(slider.valueProperty());
		
		Button btn_ola = new Button("Dizer Olá");
		Label lb_ola = new Label("Minha primeira janela");
		
		btn_ola.setLayoutX(30);
		btn_ola.setLayoutY(50);
		
		lb_ola.setLayoutX(30);
		lb_ola.setLayoutY(100);
		
		root.getChildren().addAll(btn_ola, lb_ola);
		
		btn_ola.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				lb_ola.setText("Hello, World!");
			}//fim método handle
		});//fim setOnAction
		
		primaryStage.setScene(scene);
		primaryStage.setFullScreen(true);
		primaryStage.show();
		
	}//fim do método start
 
}//fim da classe Aula01
 