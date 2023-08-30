package controller;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HistoriaClinica {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnBuscr;

    @FXML
    private TableView<?> tableDatos;

    @FXML
    private TextField txtCedula;

	private Main main;
	
	 @FXML
	    void buscarCedula(ActionEvent event) {

	    }

    @FXML
    void initialize() {
    
    }

	public void setApplication(Main main) {
		this.main=main;
	}

}


