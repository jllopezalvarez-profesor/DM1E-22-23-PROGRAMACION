Proceso ejercicio8
	Definir limiteSuperior Como Entero;
	Definir limiteInferior Como Entero;
	
	Repetir
		
		
		Escribir "Introduce el límite inferior. ";
		Leer limiteInferior;
		Escribir "Introduce el límite superior. ";
		Leer limiteSuperior;
		
		Si limiteSuperior <= limiteInferior Entonces
			Escribir "Has introducido los límite invertidos.";
		FinSi
	Hasta Que limiteSuperior > limiteInferior;
	
	Definir num Como Entero;
	Definir suma Como Entero;
	suma <- 0;
	Definir cuenta Como Entero;
	suma <- 0;
	Definir haIntroducidoLimite Como Logico;
	haIntroducidoLimite <- Falso;
	
	Escribir "Introduce un número. 0 para terminar.";
	Leer num;
	Mientras num <> 0 Hacer
		// Preguntar si num está dentro del intervalo (sin incluir límites)
		// Si está dentro, incrementar el valor de suma con el numero ( suma = suma + num)
		Si ((num > limiteInferior) y (num < limiteSuperior))  Entonces
			suma <- suma + num;
		SiNo
			cuenta <- cuenta + 1;
			Si (num = limiteInferior) o (num = limiteSuperior) Entonces
				haIntroducidoLimite <- Verdadero;
			FinSi
		FinSi
		
		Escribir "Introduce un número. 0 para terminar.";
		Leer num;
	FinMientras
	
//	Repetir
//		Escribir "Introduce un número. 0 para terminar.";
//		Leer num;
//		Si num <> 0 Entonces
//			Si ((num > limiteInferior) y (num < limiteSuperior))  Entonces
//				suma <- suma + num;
//			SiNo
//				cuenta = cuenta + 1;
//				Si (num = limiteInferior) o (num = limiteSuperior) Entonces
//					haIntroducidoLimite <- Verdadero;
//				FinSi
//			FinSi
//		FinSi
//	Hasta Que num = 0
	
	Escribir "La suma de los números en el intervalo es ", suma;
	Escribir "Hay ", cuenta, " números fuera del intervalo";
	Si haIntroducidoLimite = Verdadero Entonces
		Escribir  "Ha introducido al menos uno de los límites"; 
	SiNo
		Escribir  "No ha introducido al menos uno de los límites"; 
	FinSi
	

	
	
	
	
FinProceso
