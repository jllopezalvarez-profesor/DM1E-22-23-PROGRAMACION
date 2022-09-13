
// Ejemplo: Introducir 5 números y contar cuántos son pares
Proceso ContarPares
	Definir var, cont, num como Entero;
	cont <- 0;
	Para var <- 1 Hasta 5 Hacer // Vamos a pedir 5 números
		Escribir Sin Saltar "Dime un número: ";
		Leer num;
		Si num % 2 = 0 Entonces
			cont <- cont+1;
		FinSi
	FinPara
	Escribir "Has introducido ", cont ," números pares";
FinProceso



