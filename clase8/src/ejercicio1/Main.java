package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double tipo, importe;
		
		//se instancia la clase cuenta - consrtructor por defecto
		Cuenta cuenta1 = new Cuenta();
		
		System.out.print("Nombre Titular de la cuenta: ");
		nombre = sc.nextLine();
		System.out.print("Ingrese el numero de la cuenta: ");
		numero = sc.nextLine();
		System.out.print("Ingrese el tipo o valor de interes: ");
		tipo = sc.nextDouble();
		System.out.print("Ingrese el saldo de la cuenta: ");
		importe = sc.nextDouble();
		System.out.println();	
		
		cuenta1.setNombre(nombre);
		cuenta1.setNumeroCuenta(numero);
		cuenta1.setTipoInteres(tipo);
		cuenta1.setSaldo(importe);
		
		//instanciar la segunda cuenta - constructor con parametros
		Cuenta cuenta2 = new Cuenta("Benjamin  Bedoya", "123456789", 2.34, 2000000);
				
		//instanciar el tercer objeto - constructor personalizado
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		//parte para mostrar datos en pantalla - saldo de la cuenta1
		System.out.println("El Saldo de la cuenta 1 es: " + cuenta1.getSaldo());
		System.out.println();	
		
		//mostrar los datos de la cuenta 2
		System.out.println("Los datos de la cuenta 2 son: ");
		System.out.println("Nombre del titular de la cuenta: " + cuenta2.getNombre());
		System.out.println("El numero de la cuenta es: " + cuenta2.getNumeroCuenta());
		System.out.println("El tipo de interes que maneja es: " + cuenta2.getTipoInteres());
		System.out.println("El saldo de la cuenta es: " + cuenta2.getSaldo());
		System.out.println();		
		
		cuenta1.ingreso(1000000);
		
		//mostrar los datos de la cuenta 3
		System.out.println("Los datos de la cuenta 3 son: ");
		System.out.println("Nombre del titular de la cuenta: " + cuenta3.getNombre());
		System.out.println("El numero de la cuenta es: " + cuenta3.getNumeroCuenta());
		System.out.println("El tipo de interes que maneja es: " + cuenta3.getTipoInteres());
		System.out.println("El saldo de la cuenta es: " + cuenta3.getSaldo());
		System.out.println();	
		
		cuenta3.transferencia(cuenta2, 250000);
		
		//mostrar saldos de la cuenta 2
		System.out.println("El saldo de la cuenta 2 es: ");
		System.out.println("Saldo: " + cuenta2.getSaldo());
		System.out.println();	
		
		//mostrar el saldo de la cuenta 3
		System.out.println("El saldo de la cuenta 3 es: ");
		System.out.println("Saldo: " + cuenta3.getSaldo());
		System.out.println();		

	}

}
