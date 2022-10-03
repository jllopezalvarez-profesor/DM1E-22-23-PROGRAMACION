//################################################################################
//Escribir un programa que lea un a�o indicar si es bisiesto. 
//Nota: un a�o es bisiesto si es un n�mero divisible por 4, pero no si es 
//divisible por 100, excepto que tambi�n sea divisible por 400.
//################################################################################
// An�lisis
// Pedir un a�o y comprobar si es bisiesto.
// Datos de entrada: el a�o (entero)
// Informaci�n de salida: Si el a�o es bisiesto o no
// Variables: year (entero)
//################################################################################
// Dise�o
// 1.Leer year
// 2.Si el a�o es divisible por 4, pero no si es divisible por 100, excepto que 
//tambi�n sea divisible por 400 mostrar "A�o bisiesto"
// 3. En caso contrario, mostrar "A�o no bisiesto"
//################################################################################

Proceso CalcularYearBisiesto
	Definir year Como Entero;
	Escribir Sin Saltar "Introduce el a�o:";
	Leer year;
	Si (year % 4 = 0 Y NO (year % 100 = 0)) O year % 400 = 0 Entonces
		Escribir "A�o bisiesto.";
	SiNo
		Escribir "A�o no bisiesto.";
	FinSi
FinProceso
