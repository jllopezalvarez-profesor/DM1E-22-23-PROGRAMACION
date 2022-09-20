Proceso sin_titulo
	Definir edad, nota Como Entero;
	Definir sexo Como Caracter;
	
	Escribir Sin Saltar "Introduce la edad: ";
	Leer edad;
	Escribir Sin Saltar "Introduce la nota: ";
	Leer nota;
	Escribir Sin Saltar "Introduce el sexo: ";
	Leer sexo;
	sexo <- Mayusculas(sexo);
	
	Si nota >= 5 y edad >= 18 Entonces
		// Comprobar sexo
		//Si sexo = 'F' o sexo = 'f' Entonces
		Si sexo = 'F'  Entonces
			Escribir "Aceptada";
			
		SiNo
			//si sexo = "M" o sexo = 'm' Entonces
			si sexo = "M" Entonces
				Escribir "Posible";
			SiNo
				Escribir "Código de sexo incorrecto";
			FinSi
		FinSi
		
	SiNo
		Escribir "No aceptada";
		
	FinSi
	
	
	
FinProceso
