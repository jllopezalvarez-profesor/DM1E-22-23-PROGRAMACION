Algoritmo sumaIntervalo
	Definir limiteSuperior Como Entero;
	Definir limiteInferior Como Entero;
	
	Repetir
		Escribir "Introduce el l�mite inferior. ";
		Leer limiteInferior;
		Escribir "Introduce el l�mite superior. ";
		Leer limiteSuperior;
		
		Si limiteSuperior <= limiteInferior Entonces
			Escribir "Has introducido los l�mite invertidos.";
		FinSi
	Hasta Que limiteSuperior > limiteInferior;
	
	Definir i Como Entero;
	Definir suma Como Entero;
	suma <- 0;
	
	Para i<-limiteInferior+1 Hasta limiteSuperior-1 Hacer
		suma <- suma + i;
	FinPara
	
	Escribir "La suma es ", suma;
	
FinAlgoritmo
