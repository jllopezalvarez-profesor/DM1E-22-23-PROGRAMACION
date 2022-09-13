
Proceso Ejemplo009_Para
	Definir var como Entero;
	
	Escribir "Cuenta ascendente";
	Para var <- 1 Hasta 10 Hacer
		Escribir Sin Saltar var ," ";
	FinPara
	
	Escribir ""; // Esto es para que inserte el salto de línea.
	Escribir  "Cuenta descendente (con paso negativo)";
	Para var <- 10 Hasta 1 Con Paso -1 Hacer
		Escribir Sin Saltar var ," ";
	FinPara

	Escribir ""; // Esto es para que inserte el salto de línea.
	Escribir  "Cuenta descendente (con paso negativo de dos en dos)";
	Para var <- 20 Hasta 1 Con Paso -2 Hacer
		Escribir Sin Saltar var ," ";
	FinPara
FinProceso


