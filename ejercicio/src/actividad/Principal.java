package actividad;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable que guarda la posicion seleccionada de la lista
		int dato = 0;
		Informacion info = new Informacion();
		boolean Finproceso = false;

		// objeto licuadora
		Licuadora l = new Licuadora();
		l.setPrecio(59999);
		l.setPeso(3.5);
		l.setMarca("Oster");
		l.setCapLitros(3);
		l.setAspas(6);

		// objeto lavadora
		Lavadora la = new Lavadora();
		la.setCapLitros("10");
		la.setMarca("LG");
		la.setPeso(10.6);
		la.setPrecio(700000);
		la.setTipo("Automatica");

		// objeto portatil3
		Portatil p = new Portatil();
		p.setDd("1 TB");
		p.setMarca("HP");
		p.setPeso(4);
		p.setProcesador("i7");
		p.setPrecio(200000);

		// objeto televisor
		Tv tv = new Tv();
		tv.setMarca("Samsung");
		tv.setPeso(5);
		tv.setPrecio(1500000);
		tv.setPulgadas("60");
		tv.setTipoTv("Smart Tv");

		while (Finproceso == false) {

			try {
				dato = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Bienvenido, elija un electrodomestico \n1-lavadora \n2-licuadora \n3-portatil  \n4-tv"));
				switch (dato) {
				case 1:
					info.mostrarInformacionElec(la);// informacion lavadora
					break;
				case 2:
					info.mostrarInformacionElec(l);// informacion licuadora
					break;
				case 3:
					info.mostrarInformacionElec(p);// informacion portatil
					break;
				case 4:
					info.mostrarInformacionElec(tv);// informacion tv
				default:
					break;
				}
	
			} catch (NumberFormatException e) {
				// TODO: handle exception
				Finproceso = true;
			}
		
		}

	}
}
