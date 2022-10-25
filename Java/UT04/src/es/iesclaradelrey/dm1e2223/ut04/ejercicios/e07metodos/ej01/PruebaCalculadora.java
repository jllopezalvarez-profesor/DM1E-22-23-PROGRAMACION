package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e07metodos.ej01;

public class PruebaCalculadora {

	public static void main(String[] args) {

		int numero = 4;

		Calculadora calc = new Calculadora();

		System.out.println(calc.factorial(numero));

		Calculadora otraCalc = new Calculadora();
		System.out.println(otraCalc.factorial(numero));
	}

}
