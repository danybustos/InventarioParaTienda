package com.inventarioparatienda;

import com.inventarioparatienda.clases.ComputadoraPortatil;
import com.inventarioparatienda.clases.Televisor;
import com.inventarioparatienda.clases.TiendaElectronica;

public class Aplicacion {

	public static void main(String[] args) {
		TiendaElectronica tiendaElectronica = new TiendaElectronica();
		
		Televisor televisor = new Televisor("Smart TV", 680, 10, 75, "4K Ultra HD.");
		ComputadoraPortatil cumputadora = new ComputadoraPortatil("Dell Latitude", 220, 5, "Dell", 16, "ABC123.");
		
		tiendaElectronica.agregarProducto(televisor);
		tiendaElectronica.agregarProducto(cumputadora);
		
		tiendaElectronica.mostrarProductos();
		
		tiendaElectronica.venderProducto("Smart TV");
		tiendaElectronica.venderProducto("Dell Latitude");
		
		tiendaElectronica.mostrarProductos();
	}

}
