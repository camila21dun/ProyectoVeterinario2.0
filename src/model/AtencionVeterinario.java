package model;

import java.time.LocalDate;

public class AtencionVeterinario {

	
	private Estado estado;
	private LocalDate fecha;
	private Mascota mascota;
	private Veterinario veterinario;
	
	
	
	public AtencionVeterinario() {
		super();
	}


	

	public AtencionVeterinario(Estado estado, LocalDate fecha, Mascota mascota, Veterinario veterinario) {
		super();
		this.estado = estado;
		this.fecha = fecha;
		this.mascota = mascota;
		this.veterinario = veterinario;
	}




	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	


	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}




	public Mascota getMascota() {
		return mascota;
	}


	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}


	public Veterinario getVeterinario() {
		return veterinario;
	}


	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	



	@Override
	public String toString() {
		return "AtencionVeterinario [estado=" + estado + ", fecha=" + fecha + ", mascota=" + mascota + ", veterinario="
				+ veterinario + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((mascota == null) ? 0 : mascota.hashCode());
		result = prime * result + ((veterinario == null) ? 0 : veterinario.hashCode());
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtencionVeterinario other = (AtencionVeterinario) obj;
		if (estado != other.estado)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (mascota == null) {
			if (other.mascota != null)
				return false;
		} else if (!mascota.equals(other.mascota))
			return false;
		if (veterinario == null) {
			if (other.veterinario != null)
				return false;
		} else if (!veterinario.equals(other.veterinario))
			return false;
		return true;
	}
	
	
	
	
	
}
