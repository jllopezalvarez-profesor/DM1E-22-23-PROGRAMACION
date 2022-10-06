package es.iesclaradelrey.dm1e2223.ut02.ejemplos.ejemplo01;

public class Coche {
	private int velocidad;
	private String fechaCreacion;
	
	
	Coche(int velocidadInicial){
		System.out.println("Estoy en el constructor");
		velocidad = velocidadInicial;
		// fechaCreacion = Llamar al sistema para obtener la fecha y hora.
	}
	
//	int getVelocidad() {
//		return velocidad;
//	}
	
	int getVelocidad() {
		return velocidad;
	}

	void acelerar(int cuantosKmHora) {
		velocidad += cuantosKmHora;
	}
	
	void decelerar(int cuantosKmHora) {
		velocidad -= cuantosKmHora;
	}
	
	void parar() {
		velocidad = 0;
	}
	
	
	
	
	

}
