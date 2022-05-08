package com.example.demo.services;

import java.util.List;

import com.example.demo.entites.Paciente;

public interface pacienteService {
	
	public List<Paciente> listarPaciente();
	public Paciente buscarPaciente(long id);
	public void crearPaciente(Paciente paciente);
	public void eliminarPaciente(long id);
	public  void editarPaciente  (long id, Paciente paciente);
	
}
