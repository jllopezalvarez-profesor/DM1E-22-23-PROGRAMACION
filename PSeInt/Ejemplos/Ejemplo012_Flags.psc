
// Ejemplo: Introducir 5 n�meros e indicar si se ha 
// introducido alg�n n�mero par.
Proceso RecordarPar
	Definir var, num como Entero; 
	Definir indicador como Logico; 
	indicador <- Falso; 
	Para var <- 1 Hasta 5 Hacer
		Escribir Sin Saltar "Dime un n�mero:";
		Leer num;
		Si num % 2 = 0 Entonces 
			indicador <- Verdadero; 
		FinSi
	FinPara
	Si indicador Entonces
		Escribir "Has introducido alg�n n�mero par";
	SiNo
		Escribir "No has introducido ning�n n�mero par"; 
	FinSi 
FinProceso





