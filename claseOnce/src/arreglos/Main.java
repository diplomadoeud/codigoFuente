package arreglos;

public class Main {

	public static void main(String[] args) {
		
		//UNA COLECCION DE DATOS, QUE TODOS LOS DATOS SON DEL MISMO TIPO
		
		// 0   1   2   3   4   5   6   7   8   9
		// A - B - C - D - E - F - G - H - I - J
		
		String[] arregloLetras = new String[10];
		
		int[] arregloEnteros = new int[20];
		
		arregloEnteros[4] = 5;
		arregloEnteros[10] = 20;
		
		System.out.println(arregloEnteros[4]);
		
		//estructura FOR para recoger los arreglos y mostrar los valores que tenga contenido
		for (int x = 0; x < 20; x++) {
			//System.out.println(arregloEnteros[x]);
			arregloEnteros[x] = x + 1;
			System.out.println(arregloEnteros[x]);
		}	

	}

}
