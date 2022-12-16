package es.iesclaradelrey.dm1e2223.ut06.ejercicios.ejercicio04;

public class Programa {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("12345678A", "José     Luis   ", "López Ávarez", 50, false);
		//cuenta.setNombre("José     Luis   ");
		System.out.println(cuenta);
		cuenta.Reembolsar(-3);
		System.out.println(cuenta);
		cuenta.Reembolsar(100.34);
		System.out.println(cuenta);
		cuenta.Reembolsar(30);
		System.out.println(cuenta);
	}
}
