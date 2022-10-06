package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

public class Ejemplo09MétodosEstaticos {

	public static void main(String[] args) {
		// Ejemplo de llamada a métodos estáticos.
		// Vamos a convertir distintos tipos de datos a String
		int entero = 2343;
		double realDouble = 5482.356;
		boolean logico= true;
		// Int
		String convertido = String.valueOf(entero);
		System.out.println("Valor entero convertido " + convertido );
		// Double
		convertido = String.valueOf(realDouble);
		System.out.println("Valor doble convertido " + convertido );
		// Boolean
		convertido = String.valueOf(logico);
		System.out.println("Valor lógico convertido " + convertido );
		
		// O podemos usar métodos estáticos de la clase Math para hacer operaciones
		double raizCuadrada = Math.sqrt(realDouble);
		System.out.println("La raíz cuadrada de " + realDouble + " es " + raizCuadrada);
		double aleatorio = Math.random();
		System.out.println("Número aleatorio: " + aleatorio);
		
		

	}

}
