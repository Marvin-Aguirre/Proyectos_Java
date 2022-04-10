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

import com.example.demo.entites.Producto;
import com.example.demo.service.Producto_Service;
import com.example.demo.service.Producto_Service_Impl;


@RestController
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	Producto_Service productoService;
	
	@GetMapping()
	public List<Producto> listarProducto(){
		List<Producto> lista = productoService.listarProducto();
		return lista;
	}
	
	@GetMapping("/{id}")
	public Producto buscarProducto(@PathVariable Long id) {
		Producto estudiante = productoService.buscarProducto(id);
		return estudiante;
	}
	
	@PostMapping
	public void crearProducto(@RequestBody Producto producto) {
		productoService.crearProducto(producto);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProdcuto(@PathVariable Long id) {
		productoService.eliminarProducto(id);
	}
	
	@PutMapping("/{id}")
	public void actualizarProducto(@PathVariable Long id,@RequestBody   Producto producto) {
		productoService.actualizarProducto(id, producto);
	}
	
}
