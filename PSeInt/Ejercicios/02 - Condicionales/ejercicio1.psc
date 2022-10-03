//################################################################################
//Algoritmo que pida dos n�meros e indique si el primero es mayor que el segundo.
//################################################################################
//An�lisis
//Tenemos que pedir dos n�meros por teclado, compararlos 
//e indicar si el primero es mayor que el segundo o no.
//Datos de entrada: n�mero 1, n�mero 2 
//Informaci�n de salida: Un mensaje de texto indicando si es mayor.
//Variables: num1,num2 (enteros)
//################################################################################
//Dise�o
//1. Leer los n�meros
//2. Si el n�mero 1 es mayor que el segundo escribir "El primero es mayor"
//3. En caso contrario escribir "El primero no es mayor que el segundo"
//################################################################################

Proceso CalcularMayor
	Definir num1, num2 como Entero;
	Escribir "Dime el n�mero 1:";
	Leer num1;
	Escribir "Dime el n�mero 2:";
	Leer num2;
	Si num1>num2 Entonces
		Escribir "N�mero 1 es mayor que n�mero 2";
	SiNo
		Escribir "N�mero 1 NO es mayor que n�mero 2";
	FinSi
FinProceso
