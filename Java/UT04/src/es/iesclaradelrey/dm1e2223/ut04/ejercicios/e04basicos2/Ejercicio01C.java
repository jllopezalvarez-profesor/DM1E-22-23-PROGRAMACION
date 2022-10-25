package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribir un programa que imprima cada uno de los términos de la serie
 *         2, 5, 7, 10, 12, 15, 17,..., 1800. Además calcule e imprima la suma
 *         de los términos.
 *         
 *         Esta versión usa un for 
 */
public class Ejercicio01C {

	public static void main(String[] args) {

		int num = 2;
		int suma = 0;
		for(int i = 1; num <= 1800; i++) {
			System.out.printf("%d, ", num);
			suma += num;
			if (i % 2 == 0) {
				num += 2;
			} else {
				num += 3;
			}
		}

		System.out.println("la suma de los números es " + suma);

	}

}
