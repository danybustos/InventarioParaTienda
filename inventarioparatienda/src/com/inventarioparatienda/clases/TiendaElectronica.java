package com.inventarioparatienda.clases;

import java.util.ArrayList;

public class TiendaElectronica {
	private ArrayList<ProductoElectrodomestico> listaDeProductos = new ArrayList<>();
	
	public void agregarProducto(ProductoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	
	public void mostrarProductos() {
		System.out.println("Nuestros productos: ");
		for(ProductoElectrodomestico producto : listaDeProductos) {
			producto.mostrarInformacion();
		}
	}
	
	public ProductoElectrodomestico buscarProductoPorNombre(String nombre) {
		for(ProductoElectrodomestico producto : listaDeProductos) {
			if(producto.getNombre().equalsIgnoreCase(nombre)) {
				return producto;
			}
		}
		return null;
	}
	
	public void venderProducto(String nombre) {
		ProductoElectrodomestico producto = buscarProductoPorNombre(nombre);
		if(producto != null && producto.getCantidadDisponible() > 0) {
			producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
			System.out.println("Venta de " + producto.getNombre() + " realizada.");
		} else {
			System.out.println("Producto agotado.");
		}
	}
}
