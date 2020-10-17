package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControleLogin {
	
	public ControleLogin() {
		super();
	}

	@FXML
    private Button btEntrar;

    @FXML
    private Button btSair;

    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtSenha;
    
    @FXML
    void acaoBtSair() {
    	
    	btSair.setOnAction(event -> {

			fecharAplicacao();
    	});
    	
    }
    
    @FXML
    void acaoBtLogar() {
    	
    	btEntrar.setOnAction(event -> {
				
				logar();
			});

    }
    
    public void fecharAplicacao() {
    	
    	System.exit(0);
    }
    
    
    public void logar() {
    	
    	if (txtLogin.getText().isEmpty() || txtLogin.getText().length() <=2) {
    		
    		loginAlerta();
    	
    	}else {
    		
    		
    		
    		
    		
    		
    	}
    	
    }

	private void loginAlerta() {
		Alert alertaLogin = new Alert(AlertType.NONE);
		alertaLogin.setTitle("Informaçoes invalidas");
		alertaLogin.setContentText("Verifique suas informaçoes");
		alertaLogin.setContentText("NONE");
	}
    
    
}
			
    	
    	
    	
