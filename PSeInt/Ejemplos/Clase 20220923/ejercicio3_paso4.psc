Proceso ejercicio3_paso3
	
	Definir num Como Entero;
	Definir cuenta Como Entero;
	Definir suma Como Entero;
	
	Escribir "Introduce un n�mero";
	Leer num;
	Escribir "Has introducido el n�mero ", num;
	
	cuenta<-0;
	suma <- 0;
	
	Mientras (num <> 0) Hacer
		cuenta <- cuenta + 1;
		suma <- suma + num;
		Escribir "Introduce un n�mero";
		Leer num;
		Escribir "Has introducido el n�mero ", num;
	FinMientras
	
	Escribir "Has introducido ', cuenta, ' n�meros.';
	Escribir "La suma de los n�meros es ', suma;
	
	Si cuenta <> 0 Entonces
		Escribir "La media es ", suma / cuenta;
	SiNo
		Escribir "No se puede calcular la media porque no has introducido ning�n n�mero";
	FinSi
	
	
	
	
	
FinProceso
