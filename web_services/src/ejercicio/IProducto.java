package ejercicio;



import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IProducto {

	@WebMethod
	public ArrayList<String> mostrarPrecio ();
	
}
