Proceso ejercicio3_paso3
	
	Definir num Como Entero;
	Definir cuenta Como Entero;
	
	Escribir "Introduce un n�mero";
	Leer num;
	Escribir "Has introducido el n�mero ", num;
	
	cuenta<-0;
	
	Mientras (num <> 0) Hacer
		cuenta <- cuenta + 1;
		Escribir "Introduce un n�mero";
		Leer num;
		Escribir "Has introducido el n�mero ", num;
	FinMientras
	
	Escribir "Has introducido ', cuenta, ' n�meros.';
	
	
FinProceso
