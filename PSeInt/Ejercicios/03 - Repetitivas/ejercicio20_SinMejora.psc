//################################################################################
//Mostrar en pantalla los N primero números primos. Se pide por teclado la cantidad 
//de números primos que queremos mostrar.
//################################################################################
//Análisis
//Tengo que leer la cantidad de números primos que voy a mostrar. La cantidad debe 
//ser positivo. El primer número primo es el 2 (lo muestro) a partir de este son 
//todos impares. 
// Para comprobar si son primos, los voy dividiendo desde 3 hasta el número, si es
// divisible por algún número no es primo (necesito un indicador).
// Datos de entrada: Cantidad de números a mostrar.
// Información de salida: Los números primos indicados.
// Variables: cant_a_mostrar, cant_mostrados, divisor (entero), es_primo(lógico)
//################################################################################

Proceso Primos
    Definir cant_a_mostrar,num,cant_mostrados,divisor Como Entero;
    Definir es_primo Como Logico;
	
    Repetir
		Escribir "Ingrese la cantidad de números primos a mostrar:";
		Leer cant_a_mostrar;
	Hasta que cant_a_mostrar>0;
    
    Escribir "1: 2"; // el primer primo es 2, los otros son todos impares...
    cant_mostrados <- 1;
    num<-3;            // ...a partir de 3
    
    Mientras cant_mostrados < cant_a_mostrar Hacer
        es_primo <- Verdadero; // pienso que es primo hasta que encuentre con que dividirlo
        divisor <- 2;
		Mientras es_primo Y divisor < num Hacer
			Si num % divisor = 0 entonces // si la división da exacta...
				es_primo <- Falso;  // ...ya no es primo
			SiNo
				divisor <- divisor + 1;
            FinSi
        FinMientras
		
        Si es_primo Entonces
            cant_mostrados <- cant_mostrados + 1;
            Escribir cant_mostrados, ": ",num; //cant_mostrados hace de indice
        FinSi
		num <- num + 2 ;
    FinMientras
FinProceso
