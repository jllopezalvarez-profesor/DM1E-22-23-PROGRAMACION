

Proceso Ejemplo001
	Definir numero, resultado Como Entero;
	
	Escribir "Introduce un n�mero";
	Leer numero;
	
	resultado <- 1;
	
	Mientras numero > 1 Hacer
		resultado <- resultado * numero;
		numero <- numero -1;
	FinMientras
	
	Escribir "El resultado de la operaci�n es: ", resultado;
FinProceso


