//################################################################################
//Escribe un programa que diga si un n�mero introducido por teclado es o no primo. 
//Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad. 
//Nota: Es suficiente probar hasta la ra�z cuadrada del n�mero para ver si es 
//divisible por alg�n otro n�mero.
//################################################################################
//An�lisis
//Leemos un n�mero y vamos comprobando si es divisible entre 2 hasta la ra�z
//cuadrada del n�mero. Si es divisible por alg�n n�mero no es primo.
//Si no es divisible por ning�n n�mero es primo.
//Para saber si es divisible usamos el operador m�dulo.
// Datos de entrada: el n�mero a comprobar si es primo o no
// Informaci�n de salida: Un mensaje diciendo si es primo o no
// Variables: numero_es_primo (entero), num (entero) contador desde 2 hasta 
//ra�z cuadrada del num_es_primo, es_primo (l�gico)
//################################################################################
//Dise�o
//1.- Supongo que el n�mero es primo -> es_primo<-Verdadero
//2.-Leer num_es_primo
//3.- Desde num = 2 hasta ra�z(numero_es_rpimo)
//		4.- Si numero_es_primo es divisible entre num -> es_primo<-Falso
//5.- Si es_primo -> Mostrar "Es primo"
//6.- Si no -> Mostrar "No es primo"
//################################################################################

Proceso EsPrimo
	Definir numero_es_primo,num Como Entero;
	Definir es_primo Como Logico;
	
	es_primo<-Verdadero;
	Escribir Sin Saltar "Introduce un n�mero para comprobar si es primo:";
	Leer numero_es_primo;
	
	Para num<-2 hasta rc(numero_es_primo) Hacer
		Si numero_es_primo % num = 0 Entonces
			es_primo <- Falso; // En cuanto encontramosun divisor, ya no es primo
		FinSi
	FinPara
	
	Si es_primo Entonces
		Escribir "Es Primo";
	SiNo
		Escribir "No es Primo";
	FinSi
FinProceso
