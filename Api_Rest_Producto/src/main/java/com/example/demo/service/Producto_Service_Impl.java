package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.demo.entites.Producto;

@Service
public class Producto_Service_Impl implements Producto_Service{
	
	private static AtomicLong sequence = new AtomicLong();
	private static List<Producto> lista = new ArrayList<Producto>() {{
		add(new Producto(sequence.incrementAndGet(),"producto","sony","descripcion1","100"));
		add(new Producto(sequence.incrementAndGet(),"producto2","samsung","descripcion2","120"));
		add(new Producto(sequence.incrementAndGet(),"producto3","hp","descripcion3","130"));
	}};
	
	
	
	public List<Producto> listarProducto() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	@Override
	public Producto buscarProducto(long id) {
		for (Producto e: lista) {
			if (e.getId().equals(id))
				return e;
		}
		return null;
	}
	@Override
	public void crearProducto(Producto producto) {
		
		producto.setId(sequence.incrementAndGet());
		lista.add(producto);
		
		
	}
	@Override
	public void eliminarProducto(long id) {
		
		int index = (int) id-1;	
		lista.remove(index);
	}

	@Override
	public void actualizarProducto(long id, Producto producto) {
		
		int index = (int) id-1;	
		producto.setId(id);
		lista.set(index, producto);

	}

	
}
