package controller;

	import java.net.URL;
	import java.util.ResourceBundle;

import Excptions.ClienteException;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.TextField;
import model.Cliente;
import javafx.scene.control.Alert.AlertType;


	public class RegistrarClienteController {

		ObservableList<Cliente> listaRegistroData = FXCollections.observableArrayList();
		Cliente clienteSeleccionado;

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private Button btnActualizarRegistro;

	    @FXML
	    private Button btnAgregarRegistro;

	    @FXML
	    private Button btnEliminarRegistro;

	    @FXML
	    private Button btnLimpiar;

	    @FXML
	    private ComboBox<String> cbTipoMascota;

	    @FXML
	    private TextField txtCorreoCliente;

	    @FXML
	    private TextField txtEdadMascota;

	    @FXML
	    private TextField txtNombreCliente;

	    @FXML
	    private TextField txtNombreMascota;

	    @FXML
	    private TextField txtRazaMascota;

	    @FXML
	    private TextField txtSexoMascota;

	    @FXML
	    private TextField txtTelefonoCliente;

	    @FXML
	    private Button btnCrearCita;

		private Main main;

	    @FXML
	    void AgregarRegistro(ActionEvent event) throws Exception {
	    	agregarRegistroAction();

	    }

	    private void agregarRegistroAction() throws Exception {

	    	String nombre = txtNombreCliente.getText();
	    	String correo = txtCorreoCliente.getText();
	    	String telefono = txtTelefonoCliente.getText();


	    	String nombreMascota= txtNombreMascota.getText();
	    	String edadMascota = txtEdadMascota.getText();
	    	String razaMascota = txtRazaMascota.getText();
	    	String sexoMascota = txtSexoMascota.getText();

	    	if(datosValidos(nombre, correo, telefono, nombreMascota, edadMascota, sexoMascota)==true){
	    		Cliente cliente = null;

				try {
					cliente = main.agregarCliente(nombre, correo, telefono, nombreMascota);
					listaRegistroData.add(cliente);
					limpiarDatos();
					mostrarMensaje("Notificación Registro", "Cliente registrado", "se ha registrado con exito", AlertType.INFORMATION);

				} catch (ClienteException e) {
					mostrarMensaje("Notificación Registro", "cliente ya existe", "el cliente con Cedula "+telefono+" ya se encuentra registrado", AlertType.ERROR);


				}
			}
			else{
				mostrarMensaje("Notificación Registro", "Informacion invalida", "Informaicon invalida", AlertType.ERROR);


	    	}

		}

		@FXML
	    void EliminarRegistro(ActionEvent event) {

			Cliente cliente = main.buscarCliente(cliente);
			if(cliente == null){
				mostrarMensaje("Notificación Estudiante", "Selecciona estudiante", "Debe seleccionar estudiante", AlertType.ERROR);
			}else{
				boolean eliminado = main.eliminarRegistro(cliente.getNombre());
				if(eliminado){
					listaRegistroData.remove(cliente);
					cliente = null;
					limpiarDatos();
//					tableTransacciones.refresh();
//					tableTransacciones.getSelectionModel().clearSelection();
					mostrarMensaje("Notificación Registro", "Registro eliminado", "el registro ha sido eliminado", AlertType.ERROR);
				}else{
					mostrarMensaje("Notificación Registro", "Registro no eliminado", "El Registro No ha sido eliminado", AlertType.ERROR);

				}
			}

		}



	    @FXML
	    void Limpiar(ActionEvent event) {
	    	limpiarDatos();

	    }

	    @FXML
	    void actualizarRegistro(ActionEvent event) {

	    }

	    @FXML
	    void crearCita(ActionEvent event) {
	    	crearCita();

	    }

	    private void crearCita() {
			this.main.mostrarCrearCita();





		}

		@FXML
	    void initialize() {
	    	cbTipoMascota.getItems().addAll("Perro","Gato");

	    }



		public void setApplication(Main main) {
			this.main=main;

		}

		private boolean datosValidos(String nombre, String correo, String telefono, String nombreMascota, String edadMascota, String sexoMascota) {

			if(nombre.equals("")){
				return false;
			}
			if(correo.equals("")){
				return false;
			}
			if(telefono.equals("")){
				return false;
			}
			if(nombreMascota.equals("")){
				return false;
			}
			if(edadMascota.equals("")){
				return false;
			}
			if(sexoMascota.equals("")){
				return false;
			}

			return true;
		}

		public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

			Alert alert = new Alert(alertType);
			alert.setTitle(titulo);
			alert.setHeaderText(header);
			alert.setContentText(contenido);
			alert.showAndWait();
		}

		private void limpiarDatos() {

			txtNombreCliente.setText("");
			txtCorreoCliente.setText("");
			txtTelefonoCliente.setText("");


			txtNombreMascota.setText("");
			txtSexoMascota.setText("");
			txtRazaMascota.setText("");


		}

	}



