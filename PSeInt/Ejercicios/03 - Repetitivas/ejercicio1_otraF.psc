Proceso Factorial
	Definir num,contador Como Entero;
	Definir resultado Como Real;
	
	resultado <- 1;
	Escribir Sin Saltar "Dime un número:";
	Leer num;
	contador <- num;
	Mientras contador > 1 Hacer
		resultado <- resultado * contador;
		contador <- contador - 1;
	FinMientras
	Escribir "El resultado es ", resultado;
FinProceso
