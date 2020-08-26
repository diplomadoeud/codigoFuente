package coleccionesList;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//instanciar o crear un arraylist
		ArrayList datos = new ArrayList();
		
		// insertar datos
		for(int i = 0; i < 10; i++) {
			datos.add(i + 1);
		}
		
		System.out.println(datos);
		System.out.println(datos.size());
		
		
		//pilas en java
		Stack pila = new Stack();
		//Stack<String> pila = new Stack<String>();
		
		//insertar elementos a la pila
		pila.push("prueba");
		pila.push("prueba2");
		pila.push("prueba3");
		
		System.out.println(pila);
		
		String elemento;
		elemento = pila.pop().toString();  //puede contener objetos de cualquier objeto, se debe castear para garantizar la asignación al tipo de dato correcto
		System.out.println(elemento);
		
		
		System.out.println(pila);
		pila.clear();
		System.out.println(pila);
		
				
		//Queue cola = new Queue; // no es una clase y no se puede instanciar en Java, esto es una interface
		Queue cola = new LinkedList();
		
		//insertar datos a la cola
		cola.add(10);
		cola.add(20);
		cola.add(30);
		
		System.out.println(cola);
		
		System.out.println(cola.peek());
		
		cola.poll();
		System.out.println(cola);	
		
		// declarar un Hashtable basico
		Hashtable tabla = new Hashtable();
		//Hashtable<Integer, String> tabla2 = new Hashtable<>();
		
		//insertar valores a los hashtable
		tabla.put(1, "Camisa");
		tabla.put(2, "Pantalon");
		tabla.put(5, "Zapatos");
		
		//consulta o mostrar el hashtable
		System.out.println(tabla.get(3));
		
		//hashtable sin limitación de tipos de datos
		tabla.put("Gorra", 100000);
		System.out.println(tabla.get("Gorra"));

	}

}
