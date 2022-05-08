package com.example.demo.services;

import java.util.List;

import com.example.demo.entites.Cita;

public interface citaService {
	
	public List<Cita> listarCita();
	public Cita buscarCita(long id);
	public void agendarCita(Long id,Cita cita);
	public  void estadoCita(long id, String estado);
	public void eliminarCita(long id);
}
