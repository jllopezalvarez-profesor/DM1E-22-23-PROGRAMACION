Proceso ejercicio8B
	Definir edad, nota Como Entero;
	Definir sexo Como Caracter;
	
	Definir numero Como Entero;
	numero <-6;
	
	Escribir Sin Saltar "Introduce la edad: ";
	Leer edad;
	Escribir Sin Saltar "Introduce la nota: ";
	Leer nota;
	Escribir Sin Saltar "Introduce el sexo: ";
	Leer sexo;
	sexo <- Mayusculas(sexo);
	
	Si nota >= 5 y edad >= 18 Entonces
		// Comprobar sexo
		// No funciona porque en PSeInt no se pueden hacer "Según" con variables que no sean enteras.
		Segun  sexo Hacer
			'M', 'm': Escribir "Posible";
			'F', 'f': Escribir "Aceptada";
				
			En otro caso:
				Escribir  "Seso erróneo".
		FinSegun
	SiNo
		Escribir "No aceptada";
		
	FinSi
	
	
	
FinProceso
