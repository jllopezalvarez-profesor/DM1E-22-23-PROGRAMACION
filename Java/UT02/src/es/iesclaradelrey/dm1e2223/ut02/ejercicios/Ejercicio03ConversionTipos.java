package es.iesclaradelrey.dm1e2223.ut02.ejercicios;

public class Ejercicio03ConversionTipos {

	public static void main(String[] args) {
		int origenEntero = 5;
		double origenReal = 56.345;
		float numeroFloat = 3.56F;
		float numeroFloat2 = (float)3.56;
		
		
		int destinoEntero;
		double destinoRealDouble;
		float destinoRealFloat;
		
		destinoEntero = origenEntero; // Asignaciones entre variables del mismo tipo OK.
		// Tipos con un dominio mayor no caben en un tipo con dominio menor.
		// destinoEntero = origenReal; 
		destinoRealDouble = origenEntero;
		destinoRealDouble = origenReal;
		destinoRealFloat = origenEntero;
		// Tipos con un dominio mayor no caben en un tipo con dominio menor.
		// destinoRealFloat = origenReal;
		
		
		
		


	}

}
