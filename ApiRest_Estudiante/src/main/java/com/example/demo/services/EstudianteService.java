package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Estudiante;

public interface EstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Long id);
	public void createEstudiante(Estudiante estudiante);
	public void modifyEstudiante(Long id, Estudiante estudiante);
	public void deleteEstudiante(Long id);
}
