package es.iesclaradelrey.dm1e2223.ut04.ejemplos.metodos01;

public class Programa {

	public static void main(String[] args) {

		// Creamos el objeto para poder llamar a sus métodos
		ObjetoConMetodos objeto = new ObjetoConMetodos();

		// Llamamos al método
		objeto.printHolaMundo();

		System.out.println();
		
		objeto.printNumSiMayorQueCero(3);
		objeto.printNumSiMayorQueCero(0);
		objeto.printNumSiMayorQueCero(3);
		objeto.printNumSiMayorQueCero(-6);

		System.out.println();
		
		System.out.println(objeto.sumarEnteros(1, -1, 0));
		System.out.println(objeto.sumarEnteros(54, 220, -1800));
		System.out.println(objeto.sumarEnteros(12, -3, 34));
		System.out.println(objeto.sumarEnteros(-4, 12, 33));

	}

}
