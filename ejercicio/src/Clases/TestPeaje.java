package Clases;

public class TestPeaje  {
	
	public static void main(String[] args) {
		Auto auto = new Auto();
		Moto moto = new Moto();
		Camion camion = new Camion();
		Bus bus = new Bus();
		
		Peaje peaje = new Peaje();
		peaje.cobrarPeaje(bus);
		
	}

}
