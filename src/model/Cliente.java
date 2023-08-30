package model;

public class Cliente extends Persona {
	
	private String cedula;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String correo, String telefono) {
		super(nombre, correo, telefono);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public boolean verificarCedula(String cedula) {
		if(getCedula().equals(cedula)){
			return true;
		}
		return false;
	}

	
	

}
