package es.iesclaradelrey.dm1e2223.ut02.ejercicios.metodos;

import java.net.MalformedURLException;
import java.net.URL;

public class Ejercicio4 {

	public static void main(String[] args) throws MalformedURLException {

		URL a = new URL("http://www.google.com/q/palabra");
		URL b = new URL("http", "www.google.com", "/q/palabra");
		URL c = new URL("http", "www.google.com", 50, "/q/palabra");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
