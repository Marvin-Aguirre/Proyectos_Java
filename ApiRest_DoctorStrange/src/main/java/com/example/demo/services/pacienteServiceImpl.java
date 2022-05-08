package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entites.Paciente;



@Service
public class pacienteServiceImpl implements pacienteService {

	
	//AGREGANDO INFORMACION AL PROGRAMA MEDIANTE UN ARRAYLIST
	
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Paciente> lista = new ArrayList<Paciente>() {{
		add(new Paciente(sequence.incrementAndGet(),"Marcos","Eduardo","Marroquin","Juarez","355"));
		add(new Paciente(sequence.incrementAndGet(),"Juan","Mauricio","Lima","Perez","24"));
		add(new Paciente(sequence.incrementAndGet(),"Kevin","Estuardo","Lopez","Gudiel","32"));
	}};

	
	//MOSTRAR LISTA DE PACIENTES 
	public List<Paciente> listarPaciente() {
		return lista;
	}
	
	//METODO PARA BUSCAR UN PACIENTE EN LA LISTA      
	@Override
	public Paciente buscarPaciente (long id) {
		for (Paciente e: lista) {
			if (e.getId().equals(id))
				return e;
		}
		return null;
		
	}
	
	
	//METODO PARA AGREGAR PACIENTE
	@Override
	public void crearPaciente(Paciente paciente) {
		paciente.setId(sequence.incrementAndGet());
		lista.add(paciente);
		
	}
	
	//METODO PARA ELIMINAR UN PACIENTE
	@Override
	public void eliminarPaciente(long id) {
		int index = (int) id-1;	
		lista.remove(index);

		
	}
	
	//METODO PARA EDITAR UN PACIENTE
	@Override
	public void editarPaciente(long id, Paciente paciente) {
		
		int index = (int) id-1;	
		paciente.setId(id);
		lista.set(index, paciente);
		
	}
	
	
	
}
