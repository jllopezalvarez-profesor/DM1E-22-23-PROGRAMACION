Proceso sin_titulo
	Definir n Como Caracter;
	
	Escribir  Sin Saltar "Introduce el número ";
	Leer n;
	
	Definir primerCaracter Como Caracter;
	Definir segundoCaracter Como Caracter;
	primerCaracter <- SubCadena(n,0,0);
	segundoCaracter <- SubCadena(n,1,1);
	
	Escribir "El número introducido es ", n;
	Escribir "El número introducido (invertido) es ", segundoCaracter, primerCaracter;

	
FinProceso
