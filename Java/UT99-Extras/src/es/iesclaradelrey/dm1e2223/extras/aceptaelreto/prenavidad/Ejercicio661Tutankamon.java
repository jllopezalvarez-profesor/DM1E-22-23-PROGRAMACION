package es.iesclaradelrey.dm1e2223.extras.aceptaelreto.prenavidad;

import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio661Tutankamon {

	static class Objeto implements Comparable<Objeto> {
		private String nombre;
		private int valor;
		private int peso;
		private int posicionInventario;

		public Objeto(String nombre, int valor, int peso, int posicionInventario) {
			this.nombre = nombre;
			this.valor = valor;
			this.peso = peso;
			this.posicionInventario = posicionInventario;
		}

		@Override
		public int compareTo(Objeto o) {
			int comparacionValor = -Integer.compare(this.valor, o.valor);
			if (comparacionValor != 0)
				return comparacionValor;
			int comparacionPeso = Integer.compare(this.peso, o.peso);
			if (comparacionPeso != 0)
				return comparacionPeso;
			return Integer.compare(this.posicionInventario, o.posicionInventario);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Objects.hash(nombre);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Objeto other = (Objeto) obj;
			return Objects.equals(nombre, other.nombre);
		}

		public String getNombre() {
			return this.nombre;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		while (n != 0) {
			procesarCaso(n, scanner);
			n = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();

	}

	private static void procesarCaso(int numObjetos, Scanner sc) {
		Set<Objeto> objetos = new TreeSet<>();
		for (int i=0; i<numObjetos;i++) {
			Objeto obj = new Objeto(sc.next(), sc.nextInt(), sc.nextInt(), i);
			objetos.add(obj);
			sc.nextLine();
		}
		boolean primero = true;
		for (Objeto objeto : objetos) {
			if (!primero) {
				System.out.print(" ");
			}
			System.out.print(objeto.getNombre());
			primero = false;
		}
		System.out.println();
	}

}
