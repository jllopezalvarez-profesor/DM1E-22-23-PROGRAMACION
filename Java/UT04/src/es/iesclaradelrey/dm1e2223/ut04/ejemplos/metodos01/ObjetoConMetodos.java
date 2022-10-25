package es.iesclaradelrey.dm1e2223.ut04.ejemplos.metodos01;

public class ObjetoConMetodos {

	public void printHolaMundo() {
		System.out.println("Hola mundo!!!");
	}
	
	public void printNumSiMayorQueCero(int numero) {
		if (numero > 0)
			System.out.println(numero);
	}
	
	public int sumarEnteros(int a, int b, int c) {
		return a + b + c;
	}
}






