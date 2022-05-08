package com.example.demo.entites;

public class Poliza {
	
	private Long idPoliza;
	private Long idCliente;
	private String estado;
	private String fechaInicio;
	private String fechaFin;
	
	public Poliza(Long idPoliza, Long idCliente, String estado, String fechaInicio, String fechaFin) {
		super();
		this.idPoliza = idPoliza;
		this.idCliente = idCliente;
		this.estado = estado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Long getIdPoliza() {
		return idPoliza;
	}

	public void setIdPoliza(Long idPoliza) {
		this.idPoliza = idPoliza;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	
}
