package actividad;

import javax.swing.JOptionPane;

//clase hija
public class Lavadora extends electrodomestico {

	//atributos
	private String capLitros;
	private String tipo;
	
	//metodo por defecto
	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	//metodo con parametros
	public Lavadora(double precio, double peso, String marca, String capLitros, String tipo) {
		super(precio, peso, marca);
		// TODO Auto-generated constructor stub
		this.capLitros=capLitros;
		this.tipo=tipo;
	}

	//metodos get y set
	public String getCapLitros() {
		return capLitros;
	}

	public void setCapLitros(String capLitros) {
		this.capLitros = capLitros;
	}

	public String getTipo() {
		return tipo;
	} 

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//metodos funcionales
	@Override
	public void mostrarInformacion(electrodomestico e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Caracteristicas lavadora:  "
				+ "\n Marca :"+e.getMarca()
				+ "\n Peso :"+e.getPeso()
				+ "\n Precio :$"+e.getPrecio()
				+ "\n Capacidad :"+getCapLitros()+" Kg"
				+ "\n Tipo :"+getTipo()+"\n ---------------------");
	}
}
