
// Ejemplo: Introducir 5 n�meros y contar cu�ntos son pares
Proceso ContarPares
	Definir var, cont, num como Entero;
	cont <- 0;
	Para var <- 1 Hasta 5 Hacer // Vamos a pedir 5 n�meros
		Escribir Sin Saltar "Dime un n�mero: ";
		Leer num;
		Si num % 2 = 0 Entonces
			cont <- cont+1;
		FinSi
	FinPara
	Escribir "Has introducido ", cont ," n�meros pares";
FinProceso



