package actividad;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {

		// VERIFICAR EL NOMBRE
		String nombre = "";
		while (nombre.equalsIgnoreCase("")) {
			nombre = JOptionPane.showInputDialog("ingrese nombre");
			if (nombre == null) {
				
			}
		}

		// VERIFICAR EDAD
		String aux = "";
		while (aux.equalsIgnoreCase("")) {
			aux = JOptionPane.showInputDialog("ingrese edad");
			JOptionPane.showMessageDialog(null, "edad no valida", "Error!", JOptionPane.WARNING_MESSAGE);
			if (nombre == null) {
				JOptionPane.showMessageDialog(null, "edad no valida", "Error!", JOptionPane.WARNING_MESSAGE);
				aux = "";
			}
			
		}
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
		// int edad = Integer.parseInt(texto);

		String texto = JOptionPane.showInputDialog("Ingrese su sexo: ");
		char sexo = texto.charAt(0);

		texto = JOptionPane.showInputDialog("Ingrese su Altura: ");
		double altura = Double.parseDouble(texto);

		texto = JOptionPane.showInputDialog("Ingrese su Peso: ");
		double peso = Double.parseDouble(texto);

		// crear objetos a partir de los constructores
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();

		// enviar valores al primer constructor
		persona1.setNombre("Yamile Carmona");
		persona1.setEdad(30);
		persona1.setSexo('F');
		persona1.setPeso(52);
		persona1.setAltura(165);

		persona2.setNombre("Pedro");
		persona2.setEdad(40);
		persona2.setSexo('M');

		System.out.println("Persona 1: ");
		mostrarMensajePeso(persona1);
		System.out.println("Persona 2: ");
		mostrarMensajePeso(persona2);
		System.out.println("Persona 3: ");
		mostrarMensajePeso(persona3);

	}

	public static void mostrarMensajePeso(Persona p) {
		int IMC = p.calcularIMC();

		if (IMC == 0) {
			System.out.println("La persona esta en un peso ideal");
		} else if (IMC == -1) {
			System.out.println("La persona esta por debajo del peso ideal");
		} else {
			System.out.println("La persona esta por con sobrepeso");
		}

	}

}
