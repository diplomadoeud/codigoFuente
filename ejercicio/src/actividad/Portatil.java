package actividad;

import javax.swing.JOptionPane;

//clase hija
public class Portatil extends electrodomestico{
	
	//atributos
	private String procesador;
	private String dd;

	//contructor por defecto
	public Portatil() {
		// TODO Auto-generated constructor stub
	}

	//contructor con parametros
	public Portatil(double precio, double peso, String marca,String proce,String dd) {
		super(precio, peso, marca);
		this.procesador=proce;
		this.dd=dd;
		// TODO Auto-generated constructor stub
	}

	//metodos get y set
	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}
	
	//metodos funcionales
	@Override
	public void mostrarInformacion(electrodomestico e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Caracteristicas portatil:  "
				+ "\n Marca :"+e.getMarca()
				+ "\n Peso :"+e.getPeso()+" Kg"
				+ "\n Precio :$"+e.getPrecio()
				+ "\n Disco duro :"+getDd()
				+ "\n procesador :"+getProcesador()+"\n ---------------------");
	}
	
	
	

}
