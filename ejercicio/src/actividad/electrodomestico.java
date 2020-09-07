package actividad;


//clase padre
public abstract class electrodomestico {

	//atributos
	private double precio;
	private double peso;
	private String marca;

	//cpmtructor por defecto
	public electrodomestico() {
		
	}

	//contructor con parametros
	public electrodomestico(double precio, double peso, String marca) {
		super();
		this.precio = precio;
		this.peso = peso;
		this.marca = marca;
	}

	//metodos get y set
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//metodos funcionales
	public abstract void mostrarInformacion (electrodomestico e);
	
	
	
}
