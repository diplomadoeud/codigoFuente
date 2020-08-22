package Clases;

public class SmartPhone extends Celular{
	private float pixelescamara;
	private int tamanomemoria;
	
	public SmartPhone(String marca, String modelo, String color, float pixelescamara, int tamanomemoria) {
		super(marca, modelo, color);
		this.pixelescamara = pixelescamara;
		this.tamanomemoria = tamanomemoria;
	}
	
	@Override
	public void informarcaracteristicas() {
		super.informarcaracteristicas();
		System.out.println(String.format("El SmartPhone tiene una camara de: %s", pixelescamara));
		System.out.println(String.format("El SmartPhone tiene un tamaño de memoria de: %s ", tamanomemoria));	
	}

	public float getPixelescamara() {
		return pixelescamara;
	}

	public void setPixelescamara(float pixelescamara) {
		this.pixelescamara = pixelescamara;
	}

	public int getTamanomemoria() {
		return tamanomemoria;
	}

	public void setTamanomemoria(int tamanomemoria) {
		this.tamanomemoria = tamanomemoria;
	}
	
}
