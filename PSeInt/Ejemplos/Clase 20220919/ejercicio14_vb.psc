Proceso sin_titulo
	Definir n Como Caracter;
	
	Escribir  Sin Saltar "Introduce el n�mero ";
	Leer n;
	
	Definir primerCaracter Como Caracter;
	Definir segundoCaracter Como Caracter;
	primerCaracter <- SubCadena(n,0,0);
	segundoCaracter <- SubCadena(n,1,1);
	
	Definir resultado Como Caracter;
	resultado <- Concatenar(segundoCaracter, primerCaracter);
	
	Escribir "El n�mero introducido es ", n;
	Escribir "El n�mero introducido (invertido) es ", resultado;
	
	
	
	Definir numero Como Entero;
	numero <- 1;
	mientras Verdadero Hacer
		Escribir numero;
		Esperar 1 segundo;
		numero <- numero + 1;
	FinMientras
	
FinProceso
