package actividad;

import javax.swing.JOptionPane;

public class Licuadora extends electrodomestico{
	
	private int aspas;
	private int capLitros;
	

	public Licuadora() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Licuadora(double precio, double peso, String marca,int aspas, int capLitros) {
		super(precio, peso, marca);
		// TODO Auto-generated constructor stub
		this.aspas=aspas;
		this.capLitros=capLitros;
	}

	public int getAspas() {
		return aspas;
	}


	public void setAspas(int aspas) {
		this.aspas = aspas;
	}


	public int getCapLitros() {
		return capLitros;
	}


	public void setCapLitros(int capLitros) {
		this.capLitros = capLitros;
	}


	@Override
	public void mostrarInformacion(electrodomestico e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Caracteristicas licuadora:  "
				+ "\n Marca :"+e.getMarca()
				+ "\n Peso :"+e.getPeso() +"Kg"
				+ "\n Precio :$"+e.getPrecio()
				+ "\n Capacidad :"+getCapLitros()+"litros"
				+ "\n Cant Aspas :"+getAspas()+"\n ---------------------");
		 
	}
	
	
	


	

	

	
}
