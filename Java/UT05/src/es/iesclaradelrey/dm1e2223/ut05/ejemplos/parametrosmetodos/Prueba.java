package es.iesclaradelrey.dm1e2223.ut05.ejemplos.parametrosmetodos;

public class Prueba {

	public static void main(String[] args) {

		int variable = 3;

		calcula(variable);

		System.out.println(variable);
		variable = calcula2(variable);
		System.out.println(variable);
	}

	public static void calcula(int x) {
		x = x + 10;
	}

	public static int calcula2(int x) {
		return x + 10;
	}

}
