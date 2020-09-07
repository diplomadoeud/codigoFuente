package com.clase.ws;

import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		//http://localhost:8080/WS/Calculadora?wsdl
		Endpoint.publish("http://localhost:8080/WS/Calculadora", new Calculadora_Imp());
	}

}
