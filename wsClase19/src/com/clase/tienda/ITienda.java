package com.clase.tienda;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface ITienda {

	@WebMethod
	public String consultaProductos();
	//public String ingresarProductos(int valor, String producto);
}
