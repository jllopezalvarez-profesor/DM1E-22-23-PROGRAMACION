package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio01;

import java.util.Random;

public class Persona {
	private static final int IMC_SOBRE_PESO = 1;

	private static final int IMC_NORM_PESO = 0;

	private static final int MAX_PESO_IMC = 25;

	private static final int IMC_BAJO_PESO = -1;

	private static final int MIN_VALOR_IMC = 20;

	private static final int MAYORIA_EDAD = 18;

	private static final char SEXO_DEFECTO = 'M';

	private static final char[] LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE".toCharArray();

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double pesoKg;
	private int alturaCm;

	/*
	 * • Un constructor por defecto (sin parámetros) • Un constructor con el DNI y
	 * nombre • Un constructor con DNI, nombre, edad y sexo, el resto por defecto.
	 */
	public Persona() {
		this("", 0, "", SEXO_DEFECTO, 0, 0);
		this.setDni(generarDni());
	}

	public Persona(String nombre, String dni) {
		this(nombre, 0, dni, SEXO_DEFECTO, 0, 0);
	}

	public Persona(String nombre, int edad, String dni, char sexo) {
		this(nombre, edad, dni, sexo, 0, 0);
	}

	public Persona(String nombre, int edad, String dni, char sexo, double pesoKg, int alturaCm) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setDni(dni);
		this.setSexo(sexo);
		this.setPesoKg(pesoKg);
		this.setAlturaCm(alturaCm);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	public void setSexo(char sexo) {
//		if (esSexoCorrecto(sexo)) {
//			this.sexo = sexo;
//		} else {
//			this.sexo = SEXO_DEFECTO;
//		}
		this.sexo = this.esSexoCorrecto(sexo) ? sexo : SEXO_DEFECTO;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	private String generarDni() {
		Random rnd = new Random();
		int numeroAleatorio = rnd.nextInt(100_000_000);
		int resto = numeroAleatorio % 23;
		return String.format("%08d", numeroAleatorio) + LETRAS_DNI[resto];
	}

	private boolean esSexoCorrecto(char sexo) {
		return (sexo == 'M' || sexo == 'H');
	}

	public boolean esMayorDeEdad() {
		return this.edad >= MAYORIA_EDAD;
	}

	public int calcularIMC() {
		// peso en kg/(altura^2 en m))
		double alturaMetros = this.alturaCm / 100;
		double imc = this.pesoKg / (alturaMetros * alturaMetros);
		if (imc < MIN_VALOR_IMC)
			return IMC_BAJO_PESO;
		if (imc <= MAX_PESO_IMC)
			return IMC_NORM_PESO;
		return IMC_SOBRE_PESO;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", pesoKg=");
		builder.append(pesoKg);
		builder.append(", alturaCm=");
		builder.append(alturaCm);
		builder.append("]");
		return builder.toString();
	}

}
