package Clases;

public class test2 {
	public static void main(String[] arg) {
		SmartPhone smartphone = new SmartPhone(null, null, null, 0, 0);
		
		smartphone.setMarca("Samgsung");
		smartphone.setModelo("Galaxy");
		smartphone.setColor("Black");
		smartphone.setPixelescamara(7);
		smartphone.setTamanomemoria(128);

		System.out.println();
		smartphone.informarcaracteristicas();
				
	}

}
