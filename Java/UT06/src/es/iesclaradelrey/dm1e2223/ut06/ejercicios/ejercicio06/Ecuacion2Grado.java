package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio06;

public class Ecuacion2Grado {
	private final int a;
	private final int b;
	private final int c;
	private final int discriminante;
	private final int numRaices;
	private final double raiz1;
	private final double raiz2;

	public Ecuacion2Grado(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.discriminante = (b * b) - (4 * a * c);
		if (this.discriminante < 0) {
			this.numRaices = 0;
			this.raiz1 = Double.MIN_VALUE;
			this.raiz2 = Double.MIN_VALUE;
		} else if (this.discriminante == 0) {
			this.numRaices = 1;
			this.raiz1 = calcularRaizUno();
			this.raiz2 = this.raiz1;
		} else {
			this.numRaices = 2;
			this.raiz1 = calcularRaizUno();
			this.raiz2 = calcularRaizDos();
		}
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	private double calcularRaizUno() {
		return (-b + Math.sqrt(this.discriminante)) / (2 * a);
	}

	private double calcularRaizDos() {
		return (-b - Math.sqrt(this.discriminante)) / (2 * a);
	}

	public int getNumRaices() {
		return this.numRaices;
	}

	public double getRaizUno() {
		if (this.numRaices == 0) {
			System.out.println("Esta ecuación no tiene soluciones reales");
		}
		return this.raiz1;
	}

	public double getRaizDos() {
		if (this.numRaices == 0) {
			System.out.println("Esta ecuación no tiene soluciones reales");
		}
		return this.raiz2;
	}

}
