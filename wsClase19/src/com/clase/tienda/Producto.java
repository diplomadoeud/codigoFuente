package com.clase.tienda;

public class Producto {
	
	private String nombre;
	private int valor;
	
	public Producto(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
