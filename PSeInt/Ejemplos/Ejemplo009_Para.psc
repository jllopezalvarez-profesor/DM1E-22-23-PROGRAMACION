
Proceso Ejemplo009_Para
	Definir var como Entero;
	
	Escribir "Cuenta ascendente";
	Para var <- 1 Hasta 10 Hacer
		Escribir Sin Saltar var ," ";
	FinPara
	
	Escribir ""; // Esto es para que inserte el salto de l�nea.
	Escribir  "Cuenta descendente (con paso negativo)";
	Para var <- 10 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar var ," ";
	FinPara

	Escribir ""; // Esto es para que inserte el salto de l�nea.
	Escribir  "Cuenta descendente (con paso negativo de dos en dos)";
	Para var <- 20 Hasta 1 Con Paso -2 Hacer
		Escribir Sin Saltar var ," ";
	FinPara
	
	Escribir ""; // Esto es para que inserte el salto de l�nea.
	Definir limite Como Entero;
	Escribir "�Hasta qu� n�mero quieres que cuente?";
	Leer limite;
	
	para var <- 1 Hasta limite Con Paso 1 Hacer
		Escribir Sin Saltar var ," ";
		
	FinPara
	
FinProceso


