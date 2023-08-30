package model;

import java.time.LocalDate;

public class Factura {
	

	
	private double costo;
	private LocalDate fecha;
	private Cliente cliente;
	private String observaciones;
	private String atencion;
	
	
	
	public Factura() {
		super();
	}



	public Factura(double costo, LocalDate fecha, Cliente cliente, String observaciones, String atencion) {
		super();
		this.costo = costo;
		this.fecha = fecha;
		this.cliente = cliente;
		this.observaciones = observaciones;
		this.atencion = atencion;
	}







	public double getCosto() {
		return costo;
	}



	public void setCosto(double costo) {
		this.costo = costo;
	}




	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public String getAtencion() {
		return atencion;
	}



	public void setAtencion(String atencion) {
		this.atencion = atencion;
	}
	
	
	
	

}
