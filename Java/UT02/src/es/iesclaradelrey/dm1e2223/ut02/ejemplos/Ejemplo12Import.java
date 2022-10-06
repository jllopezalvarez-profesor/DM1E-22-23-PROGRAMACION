package es.iesclaradelrey.dm1e2223.ut02.ejemplos;

// Importamos todas las clases del paquete java.util.
import java.util.*;
import java.net.MalformedURLException;
// Importamos sólo una clase específica, URL, del paquete java.net
import java.net.URL;

public class Ejemplo12Import {
	
	public static void main(String[] args) throws MalformedURLException {
		
		// Importando un paquete completo
		// Creamos un objeto de la clase Random.
		// Esta clase está en el paquete java.util
		// La podemos usar porque hemos importado todas las clases de java.util.
		Random generadorNumeros = new Random();
		// Generamos un número aleatorio. Usamos el método nextInt de la clase.
		int numero = generadorNumeros.nextInt();
		// Mostramos el número en la consola
		System.out.println("El número generado es " + numero);
		
		
		// Importando una clase específica
		// Creamos un objeto URL, del paquete java.net.
		// La podemos usar porque hemos importado específicamente la clase.
		URL urlIesClara = new URL("https://iesclaradelrey.es/portal/index.php/es/organizacion/jefatura-de-estudios/calendario-escolar");
		// Usamos el método getProtocol del objeto URL para 
		String protocolo = urlIesClara.getProtocol();
		// Mostramos el protocolo en la consola
		System.out.println("El protocolo de la URL " + urlIesClara + " es " + protocolo);
		
		
		// Clases que no es necesario importar.
		// Usamos la clase Math, que está dentro del java.lang.
		// Las clases de java.lang no es encesario importarlas.
		int valor = -30;
		// Uso el método estático abs para calcular el valor absoluto.
		int valorAbsoluto = Math.abs(valor);
		// Muestro los resultados:
		System.out.println("El valor absoluto de " + valor + " es " + valorAbsoluto);
	}


}
