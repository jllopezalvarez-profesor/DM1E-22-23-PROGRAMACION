package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

public class Ejemplo03Ambito {

	public static void main(String[] args) {
		int a = 3;
		int b = 0;

		if (a > 0) {
			int c = 7;
			System.out.println(b);
			System.out.println(c);
		}
		// La siguiente sentencia no compilaría si la descomentamos, porque c no existe en este punto.  
		// System.out.println(c);

	}
}
