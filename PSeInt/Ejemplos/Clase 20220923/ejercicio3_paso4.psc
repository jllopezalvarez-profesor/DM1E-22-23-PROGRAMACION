Proceso ejercicio3_paso3
	
	Definir num Como Entero;
	Definir cuenta Como Entero;
	
	Escribir "Introduce un número";
	Leer num;
	Escribir "Has introducido el número ", num;
	
	cuenta<-0;
	
	Mientras (num <> 0) Hacer
		cuenta <- cuenta + 1;
		Escribir "Introduce un número";
		Leer num;
		Escribir "Has introducido el número ", num;
	FinMientras
	
	Escribir "Has introducido ', cuenta, ' números.';
	
	
FinProceso
