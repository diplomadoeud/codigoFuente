package Clases;

public class Test {

	public static void main(String[] arg) {
		Celular celular = new Celular();
		celular.setModelo("Xs ");	
		celular.setMarca("Iphone");
		celular.setColor("Negro");
		
		celular.llamar("Juan Jose");
		celular.cortarllamada();
		System.out.println();
		celular.informarcaracteristicas();
		
	}

}

