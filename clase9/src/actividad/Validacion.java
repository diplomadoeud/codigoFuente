/**
 * 
 */
package actividad;

/**
 * @author hp
 *
 */
public class Validacion {

	// SE VALIDA QUE EL NOMBRE NO QUEDE VACIO
	public boolean verificarNombre(String nombre) {
		boolean aux = true;
		if(nombre.equals("") || nombre == null) {
			aux = false;
		}
		return aux;
	}
	
}
