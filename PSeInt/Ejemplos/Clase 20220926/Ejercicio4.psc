Proceso Ejercicio4
	Definir  cuantosNumeros Como Entero;
	Definir i Como Entero;
	Definir numeroIntroducido Como Entero;
	Definir contadorMenores Como Entero;
	Definir contadorMayores Como Entero;
	Definir contadorIguales Como Entero;
	
	contadorMenores <- 0;
	contadorMayores <- 0;
	contadorIguales <- 0;
	
	Escribir "¿Cuántos números vas a introducir?";
	Leer cuantosNumeros;
	
	Para i <- 1 hasta cuantosNumeros Hacer
		// Pedir número al usuario
		Escribir "Introduce un número ";
		Leer numeroIntroducido;
		
		// Comprobar si es >0, <0 o =0
		Si numeroIntroducido > 0 Entonces
			contadorMayores <- contadorMayores + 1;
		FinSi
		Si numeroIntroducido < 0 Entonces
			contadorMenores <- contadorMenores + 1;
		FinSi
		Si numeroIntroducido = 0 Entonces
			contadorIguales <- contadorIguales + 1;
		FinSi
	FinPara
	
	Escribir "Había ", contadorMayores, " mayores que cero.";
	Escribir "Había ", contadorMenores, " menores que cero.";
	Escribir "Había ", contadorIguales, " iguales a cero.";


	
	
	
FinProceso
