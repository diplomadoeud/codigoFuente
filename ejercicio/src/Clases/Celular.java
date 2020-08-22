package Clases;

public class Celular {
		private String marca;
		private String modelo;
		private String color;
		
		public Celular(String marca, String modelo, String color) {
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
		}
		
		public Celular(){
		}
		

		public void llamar(String nombre) {
			System.out.println("llamando a "+ nombre);
		}
		
		public void cortarllamada() {
			System.out.println("llamada finalizada");
		}
		
		public void informarcaracteristicas() {
			System.out.println(String.format("Celular marca %s", marca));
			System.out.println(String.format("Celular modelo %s", modelo));
			System.out.println(String.format("Celular color %s", color));
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

}
