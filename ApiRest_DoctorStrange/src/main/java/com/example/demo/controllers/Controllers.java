package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Cita;
import com.example.demo.entites.Paciente;
import com.example.demo.entites.Poliza;
import com.example.demo.services.citaService;
import com.example.demo.services.pacienteService;
import com.example.demo.services.polizaService;


@RestController
@RequestMapping("/DoctorStrange")
public class Controllers {
	
	@Autowired
	pacienteService servicePaciente;
	
	@Autowired
	polizaService servicePoliza;
	
	@Autowired
	citaService serviceCita;
	
	@GetMapping("paciente")
	public List<Paciente> listarPacinete(){
		List<Paciente> lista = servicePaciente.listarPaciente();
		return lista;
	}
	
	//Para realizar una peticion de paciente
	@GetMapping("paciente/{id}")
	public Paciente buscarPaciente(@PathVariable Long id) {
		Paciente paciente = servicePaciente.buscarPaciente(id);
		return paciente;
	}
	
	@PostMapping("paciente")
	public void crearNuevoPaciente(@RequestBody Paciente paciente) {
		servicePaciente.crearPaciente(paciente);
	}
	
	@DeleteMapping("paciente/{id}")
	public void eliminarPaciente(@PathVariable Long id) {
		servicePaciente.eliminarPaciente(id);
	}
	
	@PutMapping("paciente/{id}")
	public void editarPaciente(@PathVariable Long id,@RequestBody   Paciente paciente) {
		servicePaciente.editarPaciente(id, paciente);
	}
	
	@GetMapping("poliza")
	public List<Poliza> listarPoliza(){
		List<Poliza> lista = servicePoliza.listarPoliza();
		return lista;
	}
	
	@PostMapping("poliza/{id}")
	public void crearNuevaPoliza(@PathVariable Long id,@RequestBody Poliza pol) {
		servicePoliza.crearPoliza(id,pol);
	}
	
	@GetMapping("poliza/{id}")
	public Poliza buscarPoliza(@PathVariable Long id) {
		Poliza pol = servicePoliza.buscarPoliza(id);
		return pol;
	}
	
	
	
	@PutMapping("poliza/{id}")
	public void modificarPoliza(@PathVariable Long id,@RequestBody   Poliza pol) {
		servicePoliza.editarPoliza(id, pol);
	}
	
	@DeleteMapping("poliza/{id}")
	public void eliminarPoliza(@PathVariable Long id) {
		servicePoliza.eliminarPoliza(id);
	}
	
	
	
	@GetMapping("cita")
	public List<Cita> listarCita(){
		List<Cita> lista = serviceCita.listarCita();
		return lista;
	}
	
	@PostMapping("cita/{id}")
	public void agendarNuevaCita(@PathVariable Long id,@RequestBody Cita cita) {
		serviceCita.agendarCita(id, cita);	
	}
	
	@GetMapping("cita/{id}")
	public Cita buscarCita(@PathVariable Long id) {
		Cita cita = serviceCita.buscarCita(id);
		return cita;
	}
	
	@PutMapping("cita/{id}")
	public void AceptarCancelarCita(@PathVariable Long id,@RequestBody String estado  ) {
		serviceCita.estadoCita(id, estado);
	}
	
	@DeleteMapping("cita/{id}")
	public void eliminarCita(@PathVariable Long id) {
		serviceCita.eliminarCita(id);
	}
	
	
}
