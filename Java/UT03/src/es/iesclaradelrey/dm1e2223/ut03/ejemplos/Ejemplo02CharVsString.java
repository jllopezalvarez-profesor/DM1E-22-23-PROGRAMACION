package es.iesclaradelrey.dm1e2223.ut03.ejemplos;

public class Ejemplo02CharVsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char variableCaracter;
		
		String variableCadena;
		
		//BIEN
		variableCaracter = 'c';
		variableCadena = "Hola";
		
		// MAL
		variableCaracter = "Hola";
		variableCadena = 'c';
		
		
	}

}
