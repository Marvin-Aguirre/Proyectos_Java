package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entites.Cita;


@Service
public class citaServiceImpl implements citaService {
	private static List<Cita> lista = new ArrayList<Cita>();

	
	public List<Cita> listarCita() {
		return lista;
	}

	@Override
	public Cita buscarCita(long id) {
		for (Cita e: lista) {
			if (e.getIdPoliza().equals(id))
				return e;
		}
		return null;
	}

	@Override
	public void agendarCita(Long id, Cita cita) {
		cita.setIdPoliza(id);
		lista.add(cita);	
		
	}

	@Override
	public void estadoCita (long id, String estado) {
		for (Cita e: lista) {
			if (e.getIdPoliza().equals(id))
				e.setEstado(estado);
		}
	}

	@Override
	public void eliminarCita(long id) {
		int index = (int) id-1;	
		lista.remove(index);
		
	}

}
