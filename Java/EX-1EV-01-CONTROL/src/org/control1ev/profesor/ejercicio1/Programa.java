package org.control1ev.profesor.ejercicio1;

import javax.swing.JOptionPane;

public class Programa {

	// Pedir tres números y calcular su
	public static void main(String[] args) {

		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número. Puede tener decimales."));
		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número. Puede tener decimales."));
		
		double resultado = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, String.format("El resultado de multiplicar %f por %f es %f", numero1, numero2, resultado));

	}

}
