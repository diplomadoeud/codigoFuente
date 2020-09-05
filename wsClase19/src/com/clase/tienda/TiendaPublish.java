package com.clase.tienda;

import javax.xml.ws.Endpoint;

public class TiendaPublish {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1516/WS/Tienda", new TiendaImp());
	}

}
