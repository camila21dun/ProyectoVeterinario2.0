package controller;
import java.net.URL;
import java.util.ResourceBundle;

import Excptions.ClienteException;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Veterinario;

public class CrearCita {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgendarCita;

    @FXML
    private DatePicker dateCita;

    @FXML
    private TextField txtCedulaC;

    @FXML
    private TextField txtCodigoV;

	private Main main;

    @FXML
    void agendarCita(ActionEvent event) throws ClienteException {
    	agendarCitaAction();
   
    }

    private void agendarCitaAction() throws ClienteException {
    	
    	Cliente cliente = main.buscarCliente(txtCedulaC.getText());
    	Veterinario veterinario = main.buscarVeterinario(txtCodigoV.getText());
    	
    	if ( cliente!=null && veterinario!=null){
    		
    	}
    	
		
	}

	@FXML
    void initialize() {
}

	public void setApplication(Main main) {
		this.main=main;

	}
}
