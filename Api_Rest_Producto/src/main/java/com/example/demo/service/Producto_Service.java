package com.example.demo.service;
import java.util.List;
import com.example.demo.entites.Producto;

public interface Producto_Service {
	
	public List<Producto> listarProducto();
	public Producto buscarProducto(long id);
	public void crearProducto(Producto estudiante);
	public void eliminarProducto(long id);
	public  void actualizarProducto (long id, Producto producto);
	
}
