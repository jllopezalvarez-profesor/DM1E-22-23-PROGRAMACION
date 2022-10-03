//################################################################################
//Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las 
//dimensiones de los lados de un tri�ngulo. 
//El programa debe determinar que tipo de tri�ngulo es, teniendo en cuenta:
//Si se cumple Pit�goras entonces es tri�ngulo rect�ngulo
//Si s�lo dos lados del tri�ngulo son iguales entonces es is�sceles.
//Si los 3 lados son iguales entonces es equil�tero.
//Si no se cumple ninguna de las condiciones anteriores, es escaleno.
//################################################################################
// An�lisis
// Pedir la medida de los tres lados de un tri�ngulo:
// Si se cumple el teorema de pit�goras es un tri�ngulo rect�ngulo
// Adem�s, si tienes dos lados iguales y uno desigual, es is�sceles
// O si tiene todos los lados iguales es equil�tero
// o si son los tres distintos es escaleno.
// Datos de entrada: los tres lados del tri�ngulo (real)
// Informaci�n de salida: Tipo de rect�ngulo
// Variables: ladoA, ladoB, ladoC (real)
//################################################################################
// Dise�o
// 1.Leer ladoA, ladoB, ladoC
// 2.Si se cumple el teorema de pit�goras ( tenemos que suponer que cualquier 
//lado puede ser la hipotenusa) mostrar "Tri�ngulo rect�ngulo"
// 3.Si tiene dos lados iguales y uno desigual mostrar "Tri�ngulo Is�sceles"
// 4. En otro caso, si tiene los tres lados iguales, mostrar "Tri�ngulo Equil�tero"
// 5. En otro caso, mostrar "Tri�ngulo Escaleno"
//################################################################################
// Ejemplos
//(3,4,5) rect�ngulo,escaleno
//(7,7,9.8994949366117) rect�ngulo,is�sceles
//################################################################################


Proceso TipoTriangulo
	Definir ladoA, ladoB, ladoC Como Real;
	
	Escribir Sin Saltar "Introduce longitud lado A:";
	Leer ladoA;
	Escribir Sin Saltar "Introduce longitud lado B:";
	Leer ladoB;
	Escribir Sin Saltar "Introduce longitud lado C:";
	Leer ladoC;
	
	//Pit�goras: la suma de los cuadrados de los catetos es igual al cuadrado de la hipotenusa
	Si ladoA^2+ladoB^2 = ladoC^2 O ladoB^2+ladoC^2 = ladoA^2 O ladoC^2+ladoA^2 = ladoB^2 Entonces
		Escribir "Tri�ngulo Rect�ngulo";
	FinSi
	
	// Lo de arriba no es incompatible con ninguna de las opciones de abajo
	// is�sceles: 2 lados iguales y 1 desigual
	Si (ladoA=ladoB y ladoA<>ladoC) O (ladoB=ladoC y ladoB<>ladoA) O (ladoC=ladoA y ladoC<>ladoB) Entonces
		Escribir "Tri�ngulo Is�sceles";
	SiNo
		// equil�tero: 3 lados iguales
		Si ladoA=ladoB Y ladoA=ladoC Entonces
			Escribir "Tri�ngulo Equil�tero";
		SiNo // los 3 lados son distintos
			Escribir "Tri�ngulo Escaleno";
		FinSi
	FinSi
FinProceso
