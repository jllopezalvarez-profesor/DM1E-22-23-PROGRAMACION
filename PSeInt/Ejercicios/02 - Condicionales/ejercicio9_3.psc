//################################################################################
//Algoritmo que pida tres números y los muestre ordenados (de mayor a menor);
//################################################################################
// Análisis
// Pedimos por teclado tres números, se comparan para mostrarlos ordenados.
// Datos de entrada: num1, num2, num3 (entero)
// Información de salida: Los tres número ordenados de mayor a menor
// Variables: num1, num2, num3 (entero)

//################################################################################

Proceso OrdenarNumeros
	Definir num1,num2,num3 Como Entero;
	Escribir "Dime el número 1:";
	Leer num1;
	Escribir "Dime el número 2:";
	Leer num2;
	Escribir "Dime el número 3:";
	Leer num3;
	
	Si num1>num2 Y num1>num3 Entonces
		Escribir sin saltar num1," "
		Si num2>num3 Entonces
			Escribir num2," ",num3;
		SiNo
			Escribir num3," ",num2;
		FinSi
	FinSi
	Si num2>num1 Y num2>num3 Entonces
		Escribir sin saltar num2," "
		Si num1>num3 Entonces
			Escribir num1," ",num3;
		SiNo
			Escribir num3," ",num1;
		FinSi
	FinSi
	Si num3>=num1 Y num3>=num2 Entonces
		Escribir sin saltar num3," "
		Si num1>num2 Entonces
			Escribir num1," ",num2;
		SiNo
			Escribir num2," ",num1;
		FinSi
	FinSi
	
FinProceso
