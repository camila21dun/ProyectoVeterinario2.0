package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearCita;

    @FXML
    private Button btnHistorial;

    @FXML
    private Button btnRegistro;

    @FXML
    private Button btnSalir;

	 Main main;



    @FXML
    void crearCita(ActionEvent event) {
    	crearCitaAction();

    }

    private void crearCitaAction() {
		this.main.mostrarCrearCita();
	}

	@FXML
    void historial(ActionEvent event) {
		crearHistorialAction();

    }

    private void crearHistorialAction() {
		this.main.mostrarHistoriaClinica();
	}

	@FXML
    void registro(ActionEvent event) {

    registroAction();

    }

    private void registroAction() {
		this.main.mostrarRegistroCliente();

	}

	@FXML
    void salir(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }

	public void setStage(Stage primaryStage) {
		// TODO Auto-generated method stub

	}


	public void setApplication(Main main) {
		this.main=main;

	}

}
