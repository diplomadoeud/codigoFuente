package ejercicio1;

public class Cuenta {
	private String nombre;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	//contructor por defecto
	public Cuenta() {
	}
	
	//constructor con parametros
	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	
	//constructor copia
	public Cuenta(final Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String s) {
		this.nombre = s;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String s) {
		this.numeroCuenta = s;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double n) {
		this.tipoInteres = n;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double n) {
		this.saldo = n;
	}
	
	//metodos de ingreso
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		
		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}
		return ingresoCorrecto;
	}
	
	//metodo de reingreso
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		
		if (n < 0) {
			reintegroCorrecto = false;
		} else if (saldo >= n) {
			saldo -= n;   
		} else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;		
	}
	
	// metodo de transferencia de valores
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		
		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}
		return correcto;
	}
	
}
