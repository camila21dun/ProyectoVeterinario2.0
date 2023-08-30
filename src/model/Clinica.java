package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Excptions.ClienteException;
import controller.CrearCita;


public class Clinica {

	private List<Veterinario>listaVeterinarios = new ArrayList<Veterinario>();
	private List<AtencionVeterinario>listaAtenciones = new ArrayList<AtencionVeterinario>();
	private List<Cliente>listaClientes= new ArrayList<Cliente>();
//	private Mascota mascota;

	public Clinica() {
		super();
		inicializarDatos();
	}


	public Clinica(List<Veterinario> listaVeterinarios, List<AtencionVeterinario> listaAtenciones,
			List<Cliente> listaClientes) {
		super();
		this.listaVeterinarios = listaVeterinarios;
		this.listaAtenciones = listaAtenciones;
		this.listaClientes = listaClientes;
		inicializarDatos();
	}


	public Clinica(String string) {
		// TODO Auto-generated constructor stub
	}


	public List<Veterinario> getListaVeterinarios() {
		return listaVeterinarios;
	}


	public void setListaVeterinarios(List<Veterinario> listaVeterinarios) {
		this.listaVeterinarios = listaVeterinarios;
	}


	public List<AtencionVeterinario> getListaAtenciones() {
		return listaAtenciones;
	}


	public void setListaAtenciones(List<AtencionVeterinario> listaAtenciones) {
		this.listaAtenciones = listaAtenciones;
	}


	public List<Cliente> getListaClientes() {
		return listaClientes;
	}


	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}


	private void inicializarDatos() {

		Veterinario veterinario = new Veterinario();
		veterinario.setCodigo("12345");
		veterinario.setCodigo("123456");
		veterinario.setCodigo("1234567");

		listaVeterinarios.add(veterinario);
	}

	public boolean verificarCedula(String cedula) {
		for (Cliente ciente : listaClientes) {
			if(ciente.verificarCedula(cedula)){
				return true;
			}
		}
		return false;
	}

	public Cliente crearRegistro(String nombre, String correo, String telefono, String cedula) throws ClienteException {

		Cliente cliente = new Cliente();

		cliente.setNombre(nombre);
		cliente.setCorreo(correo);
		cliente.setTelefono(telefono);
		cliente.setCedula(cedula);


		if(existeCliente(cedula) == true){
			throw new ClienteException("cliente ya existe");
		}
		listaClientes.add(cliente);
		return cliente;
	}

	private boolean existeCliente(String cedula) {
		for (Cliente cliente : listaClientes) {
			if(cliente.getCedula().equals(cedula)){
				return true;
			}
		}
		return false;
	}

	public boolean eliminarRegistro(String codigo) {
		if(existeCliente(codigo)){
			for (Cliente cliente : listaClientes) {
				if(cliente.getNombre().equals(codigo)){
					listaClientes.remove(cliente);
					return true;
				}
			}
		}else{
			return false;
		}
		return false;
	}

	public Cliente buscarCliente(String cedula) throws ClienteException {
		if(cedula==null){
			throw new ClienteException("El cliente que busca no existe");
		}
		Optional<Cliente> findFirst =listaClientes.stream().filter(c -> c.equals(cedula)).findFirst();
		return findFirst.orElse(null);
	}

	public Veterinario buscarVeterinario(String codigo) throws ClienteException {
		if(codigo==null){
			throw new ClienteException("El veterinario que busca no existe");
		}
		Optional<Veterinario> findFirst =listaVeterinarios.stream().filter(c -> c.equals(codigo)).findFirst();
		return findFirst.orElse(null);
	}


	public AtencionVeterinario CrearCitas(Estado estado, LocalDate fecha, Mascota mascota, Veterinario veterinario) throws ClienteException {
		AtencionVeterinario atencion = new AtencionVeterinario();

		atencion.setEstado(estado);
		atencion.setFecha(fecha);
		atencion.setMascota(mascota);
		atencion.setVeterinario(veterinario);

		if(existeCita(fecha)== true){
			throw new ClienteException("existe una cita ese dia");

		}
		listaAtenciones.add(atencion);
		return atencion;
	}

	private boolean existeCita(LocalDate fecha) {
		for (AtencionVeterinario atencion : listaAtenciones) {
			if(atencion.getFecha().equals(fecha)){
				return true;
			}
		}
		return false;
	}





}
