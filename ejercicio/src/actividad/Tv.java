package actividad;

import javax.swing.JOptionPane;

//clase hoja 
public class Tv extends electrodomestico {
	
	//atributos
	private String tipoTv;
	private String pulgadas;

	//constructor por defecto
	public Tv() {
		// TODO Auto-generated constructor stub
	}

	//contructor con parametros
	public Tv(double precio, double peso, String marca, String tipoTv,String pulgadas) {
		super(precio, peso, marca);
		// TODO Auto-generated constructor stub
		this.tipoTv=tipoTv;
		this.pulgadas=pulgadas;
	}

	//metodos get y set
	public String getTipoTv() {
		return tipoTv;
	}

	public void setTipoTv(String tipoTv) {
		this.tipoTv = tipoTv;
	}

	public String getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(String pulgadas) {
		this.pulgadas = pulgadas;
	}


	//metodo funcinal
	@Override
	public void mostrarInformacion(electrodomestico e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Caracteristicas televisor:  "
				+ "\n Marca :"+e.getMarca()
				+ "\n Peso :"+e.getPeso()+" Kg"
				+ "\n Precio :$"+e.getPrecio()
				+ "\n pulgadas :"+getPulgadas()+"'"
				+ "\n Tipo :"+getTipoTv()+"\n ---------------------");
		 
		
	}
	
	
	
	

}
