package application;


import java.io.IOException;
import java.time.LocalDate;

import Excptions.ClienteException;
import controller.CrearCita;
import controller.HistoriaClinica;
import controller.InicioController;
import controller.RegistrarClienteController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Cliente;
import model.Clinica;
import model.Estado;
import model.Mascota;
import model.Veterinario;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends javafx.application.Application {

	Stage stage;

	Clinica clinica = new Clinica("sirve?");

	 @Override
	    public void start(Stage primaryStage) throws IOException {

		 this.stage=primaryStage;
		 mostrarVentanaClientelogin();


	    }

	 public void mostrarVentanaClientelogin() {
	        try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/Inicio.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           InicioController controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	    }

	 public void mostrarRegistroCliente(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/RegistrarCliente.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           RegistrarClienteController controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }

	 public void mostrarCrearCita(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/CrearCita.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           CrearCita controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }

	 public void mostrarHistoriaClinica(){

		 try {
	            stage.close();
	            stage = new Stage();
	            //Loader lee cada línea de código y la vuelve objetos en memoria
	            FXMLLoader loader = new FXMLLoader();
	            //Dirección del paquete donde está la interfaz
	            loader.setLocation(Main.class.getResource("../view/HistoriaClinica.fxml"));
	            AnchorPane rootLayout = loader.load();
	            //Carga los controladores
	           HistoriaClinica controller = loader.getController();//Obtenemos el controlador
	            controller.setApplication(this);
	            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
	            // de cambiar de ventana con escape
	            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
	            stage.show();//Muestra el escenario principal
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }
	 }



	    public static void main(String[] args) {
	        launch(args);
	    }

	    public boolean verificarCedula(String cedula) {

			return clinica.verificarCedula(cedula);
		}

	    public Cliente agregarCliente(String nombre, String correo, String telefono, String cedula) throws Exception {
			return clinica.crearRegistro(nombre, correo, telefono, cedula);
		}

	    public boolean eliminarRegistro(String codigo) {
			return clinica.eliminarRegistro(codigo);

		}
	    
	    public Cliente buscarCliente(String cedula) throws ClienteException{
	    return clinica.buscarCliente(cedula);
	    }
	    
	    public Veterinario buscarVeterinario(String codigo) throws ClienteException{
		    return clinica.buscarVeterinario(codigo);
		    }
	    
	    public void atencionVeterinaria(Estado estado,LocalDate fecha, Mascota mascota, Veterinario veterinario) throws ClienteException{
	    	 clinica.CrearCitas(estado,fecha,mascota,veterinario);

	    }

		public Cliente buscarCliente(Cliente cliente) {
			return clinica.buscarCliente(cedula)
			

			return null;
		}
	    






}
