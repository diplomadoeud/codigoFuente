package Clases;

public class Peaje {
	
	public void cobrarPeajeAuto(Auto auto) {
		auto.mostrarTipoVehiculo();
	}
	
	public void cobrarPeajeBus(Bus bus) {
		bus.mostrarTipoVehiculo();
	}
	
	public void cobrarPeajeMoto(Moto moto) {
		moto.mostrarTipoVehiculo();
	}
	
	public void cobrarPeajeCamion(Camion camion) {
		camion.mostrarTipoVehiculo();
	}
	
	//forma corta
	public static void cobrarPeaje(Vehiculo vehiculo) {
		vehiculo.mostrarTipoVehiculo();
	}

}
