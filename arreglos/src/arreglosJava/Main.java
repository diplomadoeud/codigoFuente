package arreglosJava;

public class Main {

	public static void main(String[] args) {

		int[] arregloEnteros = new int[10];

		//arregloEnteros[0] = 2;
		//arregloEnteros[1] = 4;

	//	System.out.println(arregloEnteros[5]);

		// for para llenar los arreglos
		for (int x = 0; x < 10; x++) {
			arregloEnteros[x] = x + 1;
		}

		// for para mostrar el arreglo
		for (int i = 0; i < 10; i++) {
			System.out.println(arregloEnteros[i]);
		}
	}

}
