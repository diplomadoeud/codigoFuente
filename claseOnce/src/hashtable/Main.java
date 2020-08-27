package hashtable;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
	
		//hashtable: es una estructura de datos dinamica, se puede guardar cualquier cantidad de datos dentro de ella
		//su particularidad es que se guarda a partir del concepto llave/valor (similar a lo que se maneja en tablas de una BD)
		
		//declararión de esta estructura hashtable
		Hashtable tabla = new Hashtable();
		Hashtable<Integer, String> tabla2 = new Hashtable<>();  //forma mas adecuada de declarar un hashtable
		
		//insertar en una estructura hashtable
		tabla2.put(1, "Camisa");
		tabla2.put(2, "Pantalon");
		tabla2.put(3, "Zapatos");
		
		// consultar un hashtable
		System.out.println(tabla2.get(2));
		
		tabla.put("Gorra", 50000);
		
		System.out.println(tabla);
		
		
		
		

	}

}
