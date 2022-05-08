package com.example.demo.services;

import java.util.List;

import com.example.demo.entites.Poliza;

public interface polizaService {
	
	public List<Poliza> listarPoliza();
	public Poliza buscarPoliza(long id);
	public void crearPoliza(Long id,Poliza poliza);
	public  void editarPoliza  (long id, Poliza poliza);
	public void eliminarPoliza(long id);
	
	
}
