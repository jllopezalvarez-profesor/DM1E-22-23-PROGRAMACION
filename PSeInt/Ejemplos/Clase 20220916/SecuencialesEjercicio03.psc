Proceso sin_titulo
	// Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
	
	Definir cateto1, cateto2 Como Real;
	Definir sumaCuadrados Como Real;
	Definir hipotenusa como real;
	
	Escribir sin saltar "Introduce el primer cateto ";
	Leer cateto1;
	Escribir sin saltar "Introduce el segundo cateto ";
	Leer cateto2;
	
	sumaCuadrados <- (cateto1 ^ 2) + (cateto2 ^ 2);
	hipotenusa <- raiz(sumaCuadrados);
	
	Escribir "La hipotenusa del triángulo rectángulo es ", hipotenusa;
	
FinProceso
