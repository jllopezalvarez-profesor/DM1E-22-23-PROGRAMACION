package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejecrcicio01;

public class Programa {

	public static void main(String[] args) {
		Persona p = new Persona("José Luis", 50, "12345678A", 'H', 80, 172);
		
		System.out.println( p.toString());
		
		Persona p2 = new Persona();
		System.out.println(p2);
	}

}
