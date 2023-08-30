package model;

import java.util.ArrayList;
import java.util.List;

public class Mascota {

	private String nombre;
	private String edad;
	private String sexo;
	private Tipo tipo;
	private String raza;
	private List<AtencionVeterinario>listaAtencion= new ArrayList<AtencionVeterinario>();

	public Mascota() {
		super();
	}

	public Mascota(String nombre, String edad, String sexo, Tipo tipo, String raza,
			List<AtencionVeterinario> listaAtencion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.raza = raza;
		this.listaAtencion = listaAtencion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public List<AtencionVeterinario> getListaAtencion() {
		return listaAtencion;
	}

	public void setListaAtencion(List<AtencionVeterinario> listaAtencion) {
		this.listaAtencion = listaAtencion;
	}




}
