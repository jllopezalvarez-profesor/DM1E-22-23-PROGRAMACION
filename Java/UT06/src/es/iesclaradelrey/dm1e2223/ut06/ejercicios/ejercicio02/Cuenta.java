package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio02;

import java.util.Random;

public class Cuenta {
	private static final int MAX_LONG_NOMBRE = 50;
	private static final int MAX_NUM_CUENTA = 10_000_000;
	private static final int MIN_NUM_CUENTA = 1_000_000;
	private String numeroCuenta;
	private String nif;
	private String nombre;
	private String apellidos;
	private double saldoEuros;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		nombre = nombre.trim();
		int posicionDobleEspacio = nombre.indexOf("  ");
		while (posicionDobleEspacio != -1) {
			nombre = nombre.replace("  ", " ");
			posicionDobleEspacio = nombre.indexOf("  ");
		}
		if (nombre.length() > MAX_LONG_NOMBRE)
			nombre = nombre.substring(0, MAX_LONG_NOMBRE);
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSaldoEuros() {
		return saldoEuros;
	}

	public void setSaldoEuros(double saldoEuros) {
		this.saldoEuros = saldoEuros;
	}

	public Cuenta(String nif, String nombre, String apellidos) {
		this(nif, nombre, apellidos, 0);
	}

	public Cuenta(String nif, String nombre, String apellidos, double saldoEuros) {
		this.setNumeroCuenta(creaNumeroCuenta());
		this.setNif(nif);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setSaldoEuros(saldoEuros);
	}

	private String creaNumeroCuenta() {
		Random rnd = new Random();
		return String.valueOf(rnd.nextInt(MIN_NUM_CUENTA, MAX_NUM_CUENTA));
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuenta: ");
		builder.append(numeroCuenta);
		builder.append(". Saldo: ");
		builder.append(saldoEuros);
		builder.append("\nTitular: ");
		builder.append(nif);
		builder.append(" - ");
		builder.append(nombre);
		builder.append(" ");
		builder.append(apellidos);
		return builder.toString();
	}
	
	

}
