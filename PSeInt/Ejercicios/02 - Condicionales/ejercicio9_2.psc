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
	
	Si num1 > num2 Entonces
		Si num2 > num3 Entonces
			Escribir 'Los numeros ordenados son=',num1,',',num2,',',num3;
		Sino // num1 > num2 y num3 > num2
			Si num1 > num3 Entonces
				Escribir 'Los numeros ordenados son=',num1,',',num3,',',num2;
			Sino // num3 > num1
				Escribir 'Los numeros ordenados son=',num3,',',num1,',',num2;
			FinSi
		FinSi
	Sino // num2 > num1
		Si num1 > num3 Entonces
			Escribir 'Los numeros ordenados son=',num2,',',num1,',',num3;
		Sino // num3 > num1
			Si num2 > num3 Entonces
				Escribir 'Los numeros ordenados son=',num2,',',num3,',',num1;
			Sino // num3 > num2
				Escribir 'Los numeros ordenados son=',num3,',',num2,',',num1;
			FinSi
		FinSi
	FinSi
	
FinProceso
