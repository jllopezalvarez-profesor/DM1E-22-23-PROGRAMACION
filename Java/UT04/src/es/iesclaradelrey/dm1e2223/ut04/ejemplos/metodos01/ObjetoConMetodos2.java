package es.iesclaradelrey.dm1e2223.ut04.ejemplos.metodos01;

public class ObjetoConMetodos2 {

	// [acceso] [modificador] tipoDevuelto nombreMétodo ([parámetros])

	public int factorial(int numero) {
		int calculo = 1;
		for (int i = 1; i <= numero; i++) {
			calculo *= i;
		}
		return calculo;
	}

}
