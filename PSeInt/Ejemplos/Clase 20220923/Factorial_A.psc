Proceso Factorial_A
	Definir n, x Como Entero;
	Definir factorial Como Real;
	
	Escribir "�De qu� n�mero quieres calcular el factorial?";
	Leer n;
	
	Si n < 0 Entonces
		Escribir "Has introducido un n�mero incorrecto, tiene que ser positivo";
	SiNo
		factorial <- 1;
		Si n > 0 Entonces
			Para x <- 1 Hasta n Hacer
				factorial <- factorial * x;
			FinPara
		FinSi
		Escribir "El factorial de ", n, " es ", factorial;
	FinSi
FinProceso
