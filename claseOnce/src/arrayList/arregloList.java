package arrayList;

import java.util.ArrayList;
import java.util.Stack;

public class arregloList {

	public static void main(String[] args) {

		//ArrayList: guarda información en forma de lista, se puede acceder en cualquier momento, no requiere posición definida
		//para recorrer el arreglo. Puede o no definir una capacidad o tamña desde el inicio
		//se recomienda dejar vacio para que sea dinamico
		
		//como declaro un ArrayList
		ArrayList datos = new ArrayList();    //tamaño dinamico
		ArrayList datos2 = new ArrayList(50); //tamaño definido
		
		//insertar datos en un ArrayList
		datos.add(30);
		datos.add("Lenguaje");
		datos.add(3);
		datos.add('a');
		datos.add(23.5);
		
		int x = 100;
		//datos.add(x);	
		System.out.println(datos);
		System.out.println(datos.get(2));
		
		//obtener el tamaño del ArrayList
		System.out.println(datos.size());
		
		//----------------
		//Pila --> Stack --> permite guardar elementos dentro del arreglo, tiene una estructura conocida
		//el primero en entrar, es el ultimo en salir
		//30
		//20
		//10
		
		Stack pila = new Stack();
		Stack<String> pila2 = new Stack<String>();
		
		//insertar elementos en una pila
		pila.push("Prueba");
		pila.push(3);
		
		System.out.println(pila);
		
	    String elemento;
	    elemento = pila.pop().toString();
	    System.out.println(elemento);
	    
	    pila.clear();
	    System.out.println(pila);
		
		
		
		
		


	}

}
