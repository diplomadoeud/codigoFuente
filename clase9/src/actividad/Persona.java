package actividad;

public class Persona {
	private String nombre;
	private int edad;
	private char sexo;
	private double peso, altura;
	
	private static int PESO_IDEAL = 0;
	private static int PESO_INFERIOR = -1;
	private static int SOBREPESO = 1;
	private static char SEXO_DEFINIDO = 'M';
	
	//CONSTRUCTOR POR DEFECTO - definiendo los tipos de datos pero vacios
	public Persona() {
		this("", 0, SEXO_DEFINIDO, 0, 0);   
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);		
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//metodos definidos para la clase de persona
	// metodo para comprobar el sexo de la persona
	public void comprobarSexo() {
		if(sexo != 'M' && sexo != 'F') {
			this.sexo = SEXO_DEFINIDO;
		} 
	}
	
	//metodo para calcular el indice de masa corporal
	public int calcularIMC() {
		double pesoActual = peso / (Math.pow(altura, 2));
		
		if (pesoActual == 20) {
			return PESO_IDEAL;
		} else if (pesoActual < 20) {
			return PESO_INFERIOR;			
		} else {
			return SOBREPESO;
		}
	}
	
	//metodo para calcular si la persona es mayor de edad
	public boolean esMayorEdad() {
		boolean mayor = false;
		
		if (edad >= 18) {
			mayor = true;
		}
	
		return mayor;
	}
	
    //metodo para retornar el mensaje con la información de la persona
	public String informacionPersona() {
		String infoPersona;
		
		return "Información de la Persona Registrada: \n"
				+ "Nombre de la persona: "+ nombre +" \n"
				+ "Sexo de la persona: "+ sexo +" \n"
				+ "Edad de la persona: "+ edad + " \n"
				+ "Peso de la persona: "+ peso + " Kg \n"
				+ "Altura de la persona: "+ altura +" Cm \n";	
	}

}
