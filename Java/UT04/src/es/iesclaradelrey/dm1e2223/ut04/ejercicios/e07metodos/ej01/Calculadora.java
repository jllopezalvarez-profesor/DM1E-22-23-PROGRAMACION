package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e07metodos.ej01;

public class Calculadora {
	
	public int factorial(int numero) {
		int calculo = 1;
		for (int i = 1; i <= numero; i++) {
			calculo *= i;
		}
		return calculo;
	}
}
