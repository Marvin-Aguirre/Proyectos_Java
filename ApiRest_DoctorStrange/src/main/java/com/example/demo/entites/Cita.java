package com.example.demo.entites;

public class Cita {
	

	private String fecha;
	private String hora;
	private Long idPoliza;
	private String estado;
	private String observaciones;
	
	public Cita(String fecha, String hora, Long idPoliza, String estado, String observaciones) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.idPoliza = idPoliza;
		this.estado = estado;
		this.observaciones = observaciones;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Long getIdPoliza() {
		return idPoliza;
	}

	public void setIdPoliza(Long idPoliza) {
		this.idPoliza = idPoliza;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
