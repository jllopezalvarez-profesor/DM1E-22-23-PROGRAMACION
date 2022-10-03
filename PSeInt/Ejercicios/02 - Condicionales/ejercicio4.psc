//################################################################################
// Crea un programa que pida al usuario dos n�meros y muestre su divisi�n 
//si el segundo no es cero, o un mensaje de aviso en caso contrario.
//################################################################################
// An�lisis
// Tenemos que pedir dos n�meros, y mostrar el resultado de la divisi�n. 
// Si el divisor es 0 debemos responder un mensaje de error.
// Datos de entrada: dividendo, divisor (entero)
// Informaci�n de salida: El resultado de la divisi�n o un mensaje de error 
//indicando que el divisor es igual a 0.
// Variables: dividendo,divisor (enteros)
//################################################################################
// Dise�o
// 1. Leer los n�meros
// 2. Si el divisor es igual a 0 escribir "No se puede dividir por 0"
// 3. En caso contrario mostrar el resultado de la divisi�n
//################################################################################

Proceso CalcularDivision
	Definir dividendo,divisor Como Entero;
	Escribir 'Dime el n�mero 1:';
	Leer dividendo;
	Escribir 'Dime el n�mero 2:';
	Leer divisor;
	Si divisor=0 Entonces
		Escribir 'No puedes dividir por 0';
	SiNo
		Escribir 'La divisi�n es ',dividendo/divisor;
	FinSi
FinProceso

