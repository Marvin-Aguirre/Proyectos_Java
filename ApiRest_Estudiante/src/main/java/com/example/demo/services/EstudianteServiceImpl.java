package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EstudianteDao;
import com.example.demo.entities.Estudiante;
import com.example.demo.exception.NotFoundException;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	EstudianteDao estudianteDao;
	
	@Override
	public List<Estudiante> findAll() {
		
		return (List<Estudiante>) estudianteDao.findAll();
	}

	@Override
	public Estudiante findById(Long id) {
		Optional<Estudiante> optionalEstudiante = estudianteDao.findById(id);
		if (optionalEstudiante.isPresent()) {
			return optionalEstudiante.get();
		}else {
			throw new NotFoundException("Estudiante no encontrado");
		}
	}

	@Override
	public void createEstudiante(Estudiante estudiante) {
		estudianteDao.save(estudiante);
		
	}

	@Override
	public void modifyEstudiante(Long id, Estudiante estudiante) {
		if (estudianteDao.existsById(id)) {
			estudiante.setId(id);
			estudianteDao.save(estudiante);
		}
		
	}

	@Override
	public void deleteEstudiante(Long id) {
		if (estudianteDao.existsById(id)) {			
			estudianteDao.deleteById(id);
		}
		
	}

}
