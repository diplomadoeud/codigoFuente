package com.clase.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraImpService calculadoraservice = new CalculadoraImpService();
		ICalcular consumer = calculadoraservice.getCalculadoraImpPort();
		
		System.out.println("suma");
		System.out.println(consumer.operacion(1, 5, 10));
		
		System.out.println("resta");
		System.out.println(consumer.operacion(2, 5, 10));
		
	}

}
