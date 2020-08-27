package colasJava;

import java.util.LinkedList;
import java.util.Queue;

public class ejercicioCola {

	public static void main(String[] args) {
		
	//COLAS: maneja la estructura conocida como (primero en entrar, primero en salir)
	//se tataba similar a una lista. Se utiliza cuando no se tiene determinado el tamaño o valores a trabajar
		
	//insertar elementos en un cola se utiliza - add
	//eliminar el primer elemento de la cola - poll
	//para consultar el primer elemento que esta dentro de la cola o lista - peek
		
	//Queue cola = new Queue;  --- esto no es una clase y por lo cual no se puede instanciar en java, es realmente una interface
		
	Queue cola = new LinkedList();
	
	//insertar valores a una cola
	cola.add(10);
	cola.add("Prueba");
	
	System.out.println(cola);
	System.out.println(cola.peek());
	
	cola.poll();
	System.out.println(cola);	

	}

}
