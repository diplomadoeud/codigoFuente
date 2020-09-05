package com.clase.tienda;

import java.util.Hashtable;

import javax.jws.WebService;

@WebService
public class TiendaImp implements ITienda {

	@Override
	public String consultaProductos() {
		Hashtable<String, Double> tabla= new Hashtable<String, Double>();
		
		tabla.put("Camisa", 20000.0);
		tabla.put("Pantalon", 25000.0);
		tabla.put("Zapatos", 47000.0);
		tabla.put("Gorra", 5000.0);
		
		return tabla.toString();
		//return (String) tabla.get(opcion);

	}

//	public String ingresarProductos(int valor, String producto) {
//		
//		Producto prod = new Producto(producto, valor);
//		return "Producto registrado";
//	
//		
//	}
}
