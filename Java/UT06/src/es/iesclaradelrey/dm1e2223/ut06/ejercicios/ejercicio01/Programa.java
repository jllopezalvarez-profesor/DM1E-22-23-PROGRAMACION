package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio01;

public class Programa {

	public static void main(String[] args) {
		Persona p = new Persona("José Luis", 50, "12345678A", 'H', 80, 172);
		System.out.println(p.toString());

		for (int i = 0; i < 10; i++) {
			p = new Persona();
			System.out.println(p.toString());

		}
	}

}
