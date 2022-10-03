//################################################################################
//Mostrar en pantalla los N primero n�meros primos. Se pide por teclado la cantidad 
//de n�meros primos que queremos mostrar.
//################################################################################
//An�lisis
//Tengo que leer la cantidad de n�meros primos que voy a mostrar. La cantidad debe 
//ser positivo. El primer n�mero primo es el 2 (lo muestro) a partir de este son 
//todos impares. 
// Para comprobar si son primos, los voy dividiendo desde 3 hasta el n�mero, si es
// divisible por alg�n n�mero no es primo (necesito un indicador).
// Datos de entrada: Cantidad de n�meros a mostrar.
// Informaci�n de salida: Los n�meros primos indicados.
// Variables: cant_a_mostrar, cant_mostrados, divisor (entero), es_primo(l�gico)
//################################################################################

Proceso Primos
    Definir cant_a_mostrar,num,cant_mostrados,divisor Como Entero;
    Definir es_primo Como Logico;
	
    Repetir
		Escribir "Ingrese la cantidad de n�meros primos a mostrar:";
		Leer cant_a_mostrar;
	Hasta que cant_a_mostrar>0;
    
    Escribir "1: 2"; // el primer primo es 2, los otros son todos impares...
    cant_mostrados <- 1;
    num<-3;            // ...a partir de 3
    
    Mientras cant_mostrados < cant_a_mostrar Hacer
        es_primo <- Verdadero; // pienso que es primo hasta que encuentre con que dividirlo
        divisor <- 2;
		Mientras es_primo Y divisor < num Hacer
			Si num % divisor = 0 entonces // si la divisi�n da exacta...
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
