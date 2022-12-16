package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio04;

import java.util.Random;

public class Cuenta {
	private static final int MIN_NUM_CUENTA = 1_000_000;
	private static final int MAX_NUM_CUENTA = 10_000_000;
	private static final int MAX_LONG_NOMBRE = 50;

	private String numeroCuenta;
	private String nif;
	private String nombre;
	private String apellidos;
	private double saldoEuros;
	private boolean admiteDescubierto;

	public Cuenta(String nif, String nombre, String apellidos) {
		this(nif, nombre, apellidos, 0, false);
	}

	public Cuenta(String nif, String nombre, String apellidos, boolean admiteDescubierto) {
		this(nif, nombre, apellidos, 0, admiteDescubierto);
	}

	public Cuenta(String nif, String nombre, String apellidos, double saldoEuros, boolean admiteDescubierto) {
		this.setNumeroCuenta(creaNumeroCuenta());
		this.setNif(nif);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setSaldoEuros(saldoEuros);
		this.setAdmiteDescubierto(admiteDescubierto);
	}

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

	public boolean admiteDescubierto() {
		return admiteDescubierto;
	}

	public void setAdmiteDescubierto(boolean admiteDescubierto) {
		this.admiteDescubierto = admiteDescubierto;
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

	public void Ingresar(double cantidadEuros) {
		this.setSaldoEuros(this.getSaldoEuros() + cantidadEuros);
		// this.saldoEuros += cantidadEuros;
	}

	public void Reembolsar(double cantidadEuros) {
		if (cantidadEuros <= 0) {
			System.err.println("La cantidad a reembolsar tiene que ser mayor que cero.");
			return;
		}

		if (!admiteDescubierto) {
			if ((this.getSaldoEuros() - cantidadEuros) < 0) {
				System.err.println("No se ha realizado el reembolso porque se entraba ne descubierto");
				return;
			}
		}

		this.setSaldoEuros(this.getSaldoEuros() - cantidadEuros);
		// this.saldoEuros -= cantidadEuros;
	}

	public boolean estaEnNumerosRojos() {
		return this.getSaldoEuros() < 0;
		// return this.saldoEuros < 0;
	}

}
