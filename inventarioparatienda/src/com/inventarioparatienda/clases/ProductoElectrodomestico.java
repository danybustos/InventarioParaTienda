package com.inventarioparatienda.clases;

import java.util.concurrent.Delayed;

public class ProductoElectrodomestico {
	private String nombre;
	private double precio;
	private int cantidadDisponible;
	
	public ProductoElectrodomestico(String nombre, double precio, int cantidadDisponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public ProductoElectrodomestico(String nombre, double precio) {
		this(nombre, precio, 0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre del producto: " + nombre + ", Precio: $" + precio + ", Cantidad disponible: " + cantidadDisponible);
	}
}
