package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio05;

public class Rectangulo {
	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		if (base <= 0) {
			base = 1;
			System.err.println("La base del rectángulo no puede ser menor que uno. Se cambia a 1.");
		}
		if (altura <= 0) {
			altura = 1;
			System.err.println("La altura del rectángulo no puede ser menor que uno. Se cambia a 1.");
		}
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(int lado) {
		this(lado, lado);
	}

//	public Rectangulo(int lado) {
//		if (lado <= 0) {
//			lado = 1;
//			System.err.println("La base y la altura del rectángulo no pueden ser menores que uno. Se cambian a 1.");
//		}
//		this.base = lado;
//		this.altura = lado;
//	}

	public int getBase() {
		return this.base;
	}

	public int getAltura() {
		return this.altura;

	}

	public int getPerimetro() {
		return this.getBase() * 2 + this.getAltura() * 2;
	}

	public int getArea() {
		return this.base * this.altura;
	}

	public boolean esMasAlto(Rectangulo other) {
		return this.getAltura() > other.getAltura();
	}

	public boolean esMasAncho(Rectangulo other) {
		return this.getBase() > other.getBase();
	}

//	public int compararArea(Rectangulo other) {
//		int result = 0;
//		if (other == null || this.getArea() > other.getArea()) {
//			result = 1;
//		} else if (this.getArea() < other.getArea()) {
//			result = -1;
//		}
//		return result;
//
//	}

	public int compararArea(Rectangulo other) {
		if (other == null)
			return 1;
		int area1 = this.getArea();
		int area2 = other.getArea();
		if (area1 > area2)
			return 1;
		if (area1 < area2)
			return -1;
		return 0;
	}

}
