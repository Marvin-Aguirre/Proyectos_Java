package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Estudiante;

public interface EstudianteDao extends CrudRepository<Estudiante, Long>  {

}
