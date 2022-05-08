package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entites.Poliza;
@Service
public class polizaServiceImpl implements polizaService {

	private static AtomicLong sequence = new AtomicLong();
	private static List<Poliza> lista = new ArrayList<Poliza>();
		
	
	//Metodo para listar todas las polizas ingresadas
	public List<Poliza> listarPoliza() {
		return lista;
	}

	//Metodo para buscar una poliza
	@Override
	public Poliza buscarPoliza(long id) {
		for (Poliza e: lista) {
			if (e.getIdPoliza().equals(id))
				return e;
		}
		return null;
	}

	//Metodo para crear una nueva poliza
	@Override
	public void crearPoliza(Long id,Poliza poliza) {
		poliza.setIdPoliza(sequence.incrementAndGet());
		poliza.setIdCliente(id);
		lista.add(poliza);	
	}

	//Metodo para editar una poliza
	@Override
	public void editarPoliza(long id, Poliza poliza) {
		int index = (int) id-1;	
		poliza.setIdPoliza(id);
		lista.set(index, poliza);
		
	}
	
	//Meotdo para eliminar una poliza
	@Override
	public void eliminarPoliza(long id) {
		int index = (int) id-1;	
		lista.remove(index);
		
	}
	
}
