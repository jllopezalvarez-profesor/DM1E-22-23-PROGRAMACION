//################################################################################
// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial 
// al kilo de uva, la cual se clasifica en tipos A y B,  y adem�s en tama�os 1 y 2. 
// Cuando se realiza la venta del producto, �sta es de un solo tipo y tama�o, 
//se requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
//embarque, considerando lo siguiente: 
// si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es 
// de tama�o 1; y 30 c�ntimos si es de tama�o 2. 
// Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos 
// cuando es de tama�o 2. 
// Realice un algoritmo para determinar la ganancia obtenida.
//################################################################################
// An�lisis
// El precio final de la uva se calcula multiplicando los kilos recogidos 
// por el precio de cada kilo. El precio por kilo se calcula a partir de un precio 
// inicial sumando o restando una cantidad determinada seg�n el tama�o 
// y el tipo de la uva.
// Datos de entrada: tipo,tama�o (car�cter), 
//					 precio inicial en c�ntimos y kilos (entero)
// Informaci�n de salida: Precio final en euros (real) o mensaje de error
// Variables: precio_inicial (entero), kilos (entero), tamano (car�cter), 
//			  tipo (car�cter), precio_final (real)
//################################################################################
// Dise�o
// 1.Leer precio_inicial,kilos
// 2. Leer tipo
// 3. Si tipo no es "A" o "B" devolver mensaje de error.
// 4. Leer el tama�o
// 5. Si el tama�o no es "1" o "2" devolver mensaje d error.
// 6. Si tipo es "A" y tama�o es "1" sumo a precio_inical 20 c�ntimos.
// 7. Si tipo es "A" y tama�o es "2" sumo a precio_inical 30 c�ntimos.
// 8. Si tipo es "B" y tama�o es "1" resto a precio_inical 20 c�ntimos.
// 9. Si tipo es "B" y tama�o es "2" resto a precio_inical 30 c�ntimos.
// 10. El precio_final = precio_inicial * kilos
// 11. Muestro precio final/100 euros
//################################################################################

Proceso PrecioUva
	Definir tipo Como Caracter;
	Definir tamano Como Caracter;
	Definir precio_inicial,precio_final Como Real;
	Definir kilos Como Entero;
	
	Escribir Sin Saltar "Introduce el precio inicial por kilos de la UVA (centimos):";
	Leer precio_inicial;
	Escribir Sin Saltar "Introduce cuantos kilos has vendido:";
	Leer kilos;
	Escribir Sin Saltar "Introduce el tipo de la UVA (A/B):";
	Leer tipo;
	
	Si Mayusculas(tipo)<>"A" Y Mayusculas(tipo)<>"B" Entonces
		Escribir "Tipo incorrecto";
	SiNo
		Escribir Sin Saltar "Introduce el tama�o de la UVA (1/2):";
		Leer tamano;
		
		Si tamano<>"1" Y tamano<>"2" Entonces
			Escribir "Tama�o incorrecto";
		SiNo
			Si Mayusculas(tipo)="A" Entonces
				Si tamano="1" Entonces
					precio_inicial<-precio_inicial+20;
				SiNo
					precio_inicial<-precio_inicial+30;
				FinSi
			SiNo
				Si tamano="1" Entonces
					precio_inicial<-precio_inicial-30;
				SiNo
					precio_inicial<-precio_inicial-50;
				FinSi
			FinSi
			
			precio_final <- precio_inicial * kilos;
			Escribir "La ganancia es ", precio_final/100, " euros.";
			
		FinSi
	FinSi
FinProceso
