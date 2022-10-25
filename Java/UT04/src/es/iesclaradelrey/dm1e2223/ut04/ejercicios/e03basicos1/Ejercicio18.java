package es.iesclaradelrey.dm1e2223.ut04.ejercicios.e03basicos1;

import java.util.Scanner;

/**
 * 
 * @author jllopezalvarez
 *
 *         Hacer un programa que sea capaz de calcular el impuesto sobre la
 *         renta y lo escriba por pantalla hasta que se introduzca un salario
 *         igual a cero. El impuesto de la renta es el 15% del salario anual de
 *         cada persona, al que previamente se debe realizar una deducción en
 *         función del número de hijos, que es del 0% si tiene 0, del 5% si
 *         tiene 1 o 2 y del 15% si tiene más de 2. Tanto el salario como el
 *         número de hijos se pedirán por teclado.
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int salario, numHijos;

		System.out.println("Introducir salario, 0 para acabar");
		salario = scanner.nextInt();

		while (salario != 0) {
			System.out.println("Introducir numero de hijos");
			numHijos = scanner.nextInt();

			double salarioConDescuento; // salConDescuento es la base imponible, el salario una vez que descontamos la
										// deducción por hijos

			// Reducimos el salario en función del número de hijos
			if (numHijos <= 0)
				salarioConDescuento = salario;
			else if (numHijos <= 2)
				salarioConDescuento = salario * 95 / 100;
			else
				salarioConDescuento = salario * 85 / 100;

			// Mostramos la base imponible y calculamos el impuesto
			System.out.println("Base imponible " + salarioConDescuento);
			double conIrpf = salarioConDescuento * 15 / 100;

			// Mostramos el resultado y volvemos a preguntar el salario
			// Hay que preguntar para que pueda cambiar algo y salir del bucle
			System.out.println("Tiene que pagar " + conIrpf + " euros");
			System.out.println("Introducir salario, 0 para acabar");
			salario = scanner.nextInt();
		}

		scanner.close();
	}
}
