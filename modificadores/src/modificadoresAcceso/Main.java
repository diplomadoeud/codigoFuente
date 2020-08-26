package modificadoresAcceso;

public class Main {
	
	public static void main(String[] arg) {
		
		Persona prueba = new Persona();
		prueba.nombre = "Juan";
		prueba.edad = 30;
		
		//prueba.crecer();
		//prueba.morir();
		
		prueba.datosPersona(prueba.nombre, prueba.edad);
		
		
			
		
	}

}
