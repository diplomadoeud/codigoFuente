package modificadoresAcceso;

public class Persona {
	
	public Persona(){
		System.out.println("Se creo el objeto con la siguiente persona: "+ nombre + " su edad es: "+ edad);
	}
	
	//atributos
	String nombre = "";
	protected int edad = 0;
	
	//metodos en java
	public void crecer() {
		System.out.println("La persona crece");
	}
	
	private void morir() {
		System.out.println("La persona muere");
	}
	
	public void datosPersona(String nom, int age){
		//this.nombre = nom;
		//this.edad = age;	
		
		System.out.println("Se creo el objeto con la siguiente persona: "+ nom + " su edad es: "+ age);	
	}
	

}
