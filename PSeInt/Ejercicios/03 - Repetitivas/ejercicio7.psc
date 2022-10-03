//################################################################################
//Realizar una algoritmo que muestre la tabla de multiplicar de un n�mero 
//introducido por teclado.
//################################################################################
//An�lisis
//Leemos el n�mero del que queremos mostrar la tabla
//Necesitamos un contador para contar de 1 a 10
//Tenemos que repetir 10 veces -> En cada vuelta debemos mostrar:
// el contador * el numero = resultado de la multiplicaci�n
// Datos de entrada: El n�mero de la tabla, y un contador de 1 a 10.
// Informaci�n de salida:Las 10 operaciones de la tabla de multiplicaci�n
// Variables:tabla,num (enteros)
//################################################################################
//Dise�o
//1.- Leer tabla
//2.- desde numero de 1 a 10
//3.- Mostrar num * tabla = (num*tabla)
//################################################################################

Proceso TablaMultiplicar
	Definir tabla, i Como Entero;
	
	Escribir Sin Saltar "�De qu� n�mero quieres mostrar la tabla de multiplicar?:";
	Leer tabla;
	
	Para num<-1 hasta 10 Hacer
		Escribir num," * ",tabla," = ",num*tabla;
	FinPara
FinProceso
