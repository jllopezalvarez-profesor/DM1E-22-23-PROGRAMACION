package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e07metodos.ej01;

/**
 * 
 * @author jllopezalvarez
 *
 */
public class Metodos {

	/**
	 * Crea una subrutina en java a la que se le pase un número N que se le pedirá
	 * al usuario y muestre por pantalla la frase “Módulo ejecutándose” N veces.
	 *
	 * @param numVeces número de veces que queremos que se repita la frase
	 */
	public void repetirModulo(int numVeces) {
		for (int i = 0; i < numVeces; i++) {
			System.out.println("Módulo ejecutándose.");
		}
	}

	public double suma(double a, double b) {
		return a + b;
	}

}
