Proceso Factorial_c
	Definir n, x Como Entero;
	Definir factorial Como Real;
	
	Escribir "¿De qué número quieres calcular el factorial?";
	Leer n;
	
	Si n < 0 Entonces
		Escribir "Has introducido un número incorrecto, tiene que ser positivo";
	SiNo
		factorial <- 1;
		Si n > 0 Entonces
			x <- 2;
			Mientras (x <= n) Hacer
				factorial <- factorial * x;
				x <- x+1;
			FinMientras
		FinSi
		Escribir "El factorial de ", n, " es ", factorial;
	FinSi
FinProceso
