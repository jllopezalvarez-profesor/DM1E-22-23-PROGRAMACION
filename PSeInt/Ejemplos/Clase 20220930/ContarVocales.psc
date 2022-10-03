Proceso sin_titulo
	Definir cadena Como Caracter;
	
	Leer cadena;
	cadena <- Minusculas(cadena);
	
	
	definir i Como Entero;
	definir letra Como Caracter;
	definir numVocales Como Entero;
	numvocales <- 0;
	
	Para i<-0 hasta Longitud(cadena)-1 Hacer
		letra <- Subcadena(cadena, i, i);
		Si letra = "a" o letra = "e" o letra = "i" o letra = "o" o letra = "u" Entonces
			numvocales <- numvocales + 1;
		FinSi
	FinPara
	
	escribir "Encontradas ", numvocales, " vocales";
	
	
	
	
FinProceso
