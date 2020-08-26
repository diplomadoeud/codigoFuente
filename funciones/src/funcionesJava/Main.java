package funcionesJava;

public class Main {

	public static void main(String[] args) {
		
		saludo();
		
		int response = 0;
		response = devuelveValor();
		System.out.println(response);
		
		//forma corta
		//System.out.println(devuelveValor());
		
		//llamar funcion que recibe valores
		int suma = sumaNumeros(10, 20);
		System.out.println("El resultado de la operación es: " + suma);
		
		//otra forma
		//System.out.println("El resultado de la operación es: " + sumaNumeros(10, 20));
	

	}
	
	//funcion que ejecuta un codigo
	public static void saludo() {
		System.out.println("Hola");		
	}
	
	//funcion con retorno de valor
	public static int devuelveValor() {
		return 5;
	}
	
	public static int sumaNumeros(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

}
