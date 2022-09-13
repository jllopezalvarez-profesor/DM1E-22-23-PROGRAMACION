
// Pedir al usuario 5 números y calcular la suma 
// de los pares y el producto de los impares
Proceso Acumular
	Definir var, num, sumaPares, productoImpares como Entero;
	sumaPares <- 0;
	productoImpares <- 1;
	
	Para var <- 1 Hasta 5 Hacer // Vamos a pedir 5 números
		Escribir Sin Saltar "Dime un número: ";
		Leer num;
		Si num % 2 = 0 Entonces // Es par
			sumaPares <- sumaPares + num;
		SiNo
			productoImpares <- productoImpares * num;
		FinSi
	FinPara
	Escribir "La suma de los números pares es ", sumaPares ,".";	
	Escribir "El producto de los números impares es ", productoImpares ,".";
FinProceso





