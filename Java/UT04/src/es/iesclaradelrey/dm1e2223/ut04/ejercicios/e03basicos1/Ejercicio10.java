package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

public class Ejercicio10 {

	public static void main(String[] args) {

		// 
		
		// Primero todos los números de 1 a 100;
		// Esto no lo pide el enunciado original
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// Solo los pares (método 1)
		for (int i = 1; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Solo los pares (método 2, con for, de 2 en dos)
		for (int i = 2; i <= 200; i += 2) {
			System.out.println(i);
		}

		// Solo los pares (método 3, con while, observar que es casi igual que el for)
		int i = 2;
		while (i <= 200) {
			System.out.println(i);
			i+=2;
		}
	}

}
