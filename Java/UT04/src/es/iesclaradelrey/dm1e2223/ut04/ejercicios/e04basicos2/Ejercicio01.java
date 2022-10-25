package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e04basicos2;

/**
 * 
 * @author jllopezalvarez
 *
 *         Escribir un programa que imprima cada uno de los términos de la serie
 *         2, 5, 7, 10, 12, 15, 17,..., 1800. Además calcule e imprima la suma
 *         de los términos.
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		int num = 0;
		int suma = 0;
		while (num <= 1800) {
			num += 2;
			if (num <= 1800) {
				System.out.printf("%d, ", num);
				suma += num;
			}
			num += 3;
			if (num <= 1800) {
				System.out.printf("%d, ", num);
				suma += num;
			}
		}
		
		System.out.println("la suma de los números es " + suma);

	}

}
