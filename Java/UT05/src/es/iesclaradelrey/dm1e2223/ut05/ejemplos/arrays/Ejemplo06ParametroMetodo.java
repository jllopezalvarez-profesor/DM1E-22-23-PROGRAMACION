package es.iesclaradelrey.dm1e2223.ut05.ejemplos.arrays;

/**
 * 
 * Ejemplo de como inicializar un array con valores conocidos.
 * 
 */
public class Ejemplo06ParametroMetodo {

	public static void main(String[] args) {

		// Creación de un array e inicialización posición a posición
		int[] array1 = new int[3];
		array1[0] = 33;
		array1[1] = 12;
		array1[2] = 59;

		// Creación de un array e inicialización en una sóla línea
		int[] array2 = { 15, 98, 67 };

		// Creamos un objeto Metodos para poder llamar a métodos.
		MetodosEjemplo06 metodos = new  MetodosEjemplo06();
		metodos.muestraContenidoArray(array1);
		metodos.muestraContenidoArray(array2);
		
	}
}
