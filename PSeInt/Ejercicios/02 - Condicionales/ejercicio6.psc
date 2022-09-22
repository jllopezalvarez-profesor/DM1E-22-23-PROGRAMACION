//################################################################################
//Programa que lea una cadena por teclado y compruebe si es una letra may�scula.
//################################################################################
// An�lisis
// Pedimos por teclado una cadena 
//y hay que comprobar que todas las letras sean may�sculas.
// Datos de entrada: cadena (cadena)
// Informaci�n de salida: Mensajes de es may�sculas o no es may�sculas.
// Variables: cadena (cadena)
//################################################################################
// Dise�o
// 1. Leer la cadena
// 2. Si la cadena es igual a la cadena convertida en may�sculas, 
//	  mostrar "La cadena es may�sculas"
// 3. En caso contrario mostrar "La cadena no es may�sculas"
//################################################################################

Proceso EsMayusuculas
	Definir cad como Cadena;
	Escribir Sin Saltar "Introduce una cadena:";
	Leer cad;
	Si cad=Mayusculas(cad) Entonces
		Escribir "La cadena es may�sculas";
	SiNo
		Escribir "La cadena no es may�sculas";
	FinSi
FinProceso