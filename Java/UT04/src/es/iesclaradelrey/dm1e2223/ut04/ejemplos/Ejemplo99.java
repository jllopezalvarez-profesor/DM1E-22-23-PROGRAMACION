package es.iesclaradelrey.dm1e2223.ut04.ejemplos;

public class Ejemplo99 {

	public static void main(String[] args) {
		int i = 0;

		while (i < 10) {
			System.out.println("Valor de i: " + i);
			i++;
		}

		System.out.println("Valor de i tras salir de while: " + i);

		System.out.println();

		i = 0;
		while (i < 10) {
			System.out.println("Valor de i: " + i);
			i++;
			if (i == 5)
				break;
		}

		System.out.println();

		boolean encontrado = false;
		i = 0;
		while (i < 10 && !encontrado) {
			i++;
			System.out.println("Valor de i: " + i);
			if (i == 5)
				encontrado = true;
		}

		encontrado = false;
		for (int j = 0; j < 10 && !encontrado; j++) {
			System.out.println("Valor de i: " + i);
			if (i == 5)
				encontrado = true;
		}

	}

}
