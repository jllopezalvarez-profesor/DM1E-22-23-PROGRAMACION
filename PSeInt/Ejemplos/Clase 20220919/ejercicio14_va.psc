Proceso sin_titulo
	Definir  n Como Entero;
	Definir  a, b Como Entero;
	
	Escribir  Sin Saltar "Introduce el número ";
	Leer n;
	
	a <- trunc(n/10);
	b <- n % 10;
	
	Escribir "El número invertido es ", (b*10)+a;
	
FinProceso
