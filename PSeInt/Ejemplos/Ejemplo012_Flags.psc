
// Ejemplo: Introducir 5 números e indicar si se ha 
// introducido algún número par.
Proceso RecordarPar
	Definir var, num como Entero; 
	Definir indicador como Logico; 
	indicador <- Falso; 
	Para var <- 1 Hasta 5 Hacer
		Escribir Sin Saltar "Dime un número:";
		Leer num;
		Si num % 2 = 0 Entonces 
			indicador <- Verdadero; 
		FinSi
	FinPara
	Si indicador Entonces
		Escribir "Has introducido algún número par";
	SiNo
		Escribir "No has introducido ningún número par"; 
	FinSi 
FinProceso





