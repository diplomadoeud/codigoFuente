package ejercicio;

import javax.xml.ws.Endpoint;


public class ProductoPublish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8084/Producto", new ProductoImp ());
	}

}
