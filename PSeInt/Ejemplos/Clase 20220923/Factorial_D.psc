Proceso Factorial_d
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
			Repetir
				factorial <- factorial * x;
				x <- x+1;
			Hasta Que x > n 
		FinSi
		Escribir "El factorial de ", n, " es ", factorial;
	FinSi
FinProceso
