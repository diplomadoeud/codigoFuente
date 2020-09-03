package com.clase.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalcular {
	
	@WebMethod
	public double operacion(int opcion, int valor1, int valor2);

}
