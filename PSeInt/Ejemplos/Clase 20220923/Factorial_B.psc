Proceso Factorial_b
	Definir n, x Como Entero;
	Definir factorial Como Real;
	
	Escribir "¿De qué número quieres calcular el factorial?";
	Leer n;
	
	Si n < 0 Entonces
		Escribir "Has introducido un número incorrecto, tiene que ser positivo";
	SiNo
		factorial <- 1;
		Si n > 0 Entonces
			Para x <- n Hasta 2 Con Paso -1 Hacer
				factorial <- factorial * x;
			FinPara
		FinSi
		Escribir "El factorial de ", n, " es ", factorial;
	FinSi
FinProceso
