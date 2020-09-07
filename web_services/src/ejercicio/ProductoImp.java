package ejercicio;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface = "ejercicio.IProducto")
public class ProductoImp implements IProducto {

	@Override
	public ArrayList<String>mostrarPrecio() {
		
		ArrayList<String> precioxProduct = new ArrayList<String>();
		precioxProduct.add("tv $1000000");
		precioxProduct.add("play5 $1500000");
		
		return precioxProduct;
	}
	
}
