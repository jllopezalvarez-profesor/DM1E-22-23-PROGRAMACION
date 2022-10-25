package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribir un programa que imprima cada uno de los términos de la serie
 *         2, 5, 7, 10, 12, 15, 17,..., 1800. Además calcule e imprima la suma
 *         de los términos.
 */
public class Ejercicio01B {

	public static void main(String[] args) {

		int num = 2;
		int suma = 0;
		int contador = 1;
		while (num <= 1800) {
			System.out.printf("%d, ", num);
			suma += num;
			if (contador % 2 == 0) {
				num += 2;
			} else {
				num += 3;
			}
			contador++;
		}

		System.out.println("la suma de los números es " + suma);

	}

}
