package com.clase.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.clase.ws.ICalcular")
public class Calculadora_Imp implements ICalcular {

	public Calculadora_Imp() {
	}

	@Override
	public double operacion(int opcion, int valor1, int valor2) {
		double result = 0;
		
		switch (opcion) {
		case 1:
			result = valor1+valor2;
			break;
		case 2:
			result = valor1-valor2;
			break;
		case 3:
			result = valor1*valor2;
			break;
		case 4:
			result = valor1/valor2;
		default:
			break;
		}
		return result;
	}

}
