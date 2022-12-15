package es.iesclaradelrey.dm1e2223.extras.aceptaelreto;

import java.util.Scanner;

// Explicación de las relaciones entre números, demostrado con 3 matrices generadas con 0 como valor inicial, de 3, 5 y 7 filas/columnas
// n es el número de filas / columnas 
/*
------------
   7   0   5	< Desde el primer valor (k, en posición [0][n/2]) a la derecha crece en pasos de n+2 (3+2=5). El valor a la izquierda del primero es siempre el último - 1, es decir, (k+(n*n)-1)-1 = k+(n*n)-2, y desde ahí decrece a la izquierda en pasos de n+2   
   2   4   6
   3   8   1	< El último valor está siempre en la posición central inferior y es igual a k+(n*n)-1 (8)
------------
Ancho: 3 - Inicial: 0 - Inferior izquierda: 3 - Superior derecha: 5
------------
--------------------
  16  23   0   7  14 	< Primer valor 0, a su izquierda 0+25-2=23. Crece a la derecha de 7 en 7 (5+2). Decrecen a la izquierda de 7 en 7
  22   4   6  13  15
   3   5  12  19  21
   9  11  18  20   2
  10  17  24   1   8
--------------------
Ancho: 5 - Inicial: 0 - Inferior izquierda: 10 - Superior derecha: 14
--------------------
----------------------------
  29  38  47   0   9  18  27
  37  46   6   8  17  26  28
  45   5   7  16  25  34  36
   4  13  15  24  33  35  44
  12  14  23  32  41  43   3
  20  22  31  40  42   2  11
  21  30  39  48   1  10  19
----------------------------
Ancho: 7 - Inicial: 0 - Inferior izquierda: 21 - Superior derecha: 27
----------------------------
------------------------------------
  46  57  68  79   0  11  22  33  44
  56  67  78   8  10  21  32  43  45
  66  77   7   9  20  31  42  53  55
  76   6  17  19  30  41  52  54  65
   5  16  18  29  40  51  62  64  75
  15  26  28  39  50  61  63  74   4
  25  27  38  49  60  71  73   3  14
  35  37  48  59  70  72   2  13  24
  36  47  58  69  80   1  12  23  34
------------------------------------
Ancho: 9 - Inicial: 0 - Inferior izquierda: 36 - Superior derecha: 44
------------------------------------ 
 */

public class Ejercicio120CteMagicaSinArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		while (n != 0) {
			System.out.println(calculaCteMagica(n, k));
			n = scanner.nextInt();
			k = scanner.nextInt();
		}

//		calculaCteMagica(3, 0);
//		calculaCteMagica(5, 0);
//		calculaCteMagica(7, 0);
//		calculaCteMagica(9, 0);
//		calculaCteMagica(11, 0);

		scanner.close();
	}

	private static int calculaCteMagica(int n, int k) {
		if (n == 1)
			return k;

		int primerValor = k;
		int penultimoValor = k + (n * n) - 2;
		int salto = n + 2;
		int suma = 0;

		// Acumulamos los que van desde el primero (centro de primera fila) a la derecha
		// for (int i=(n/2); i<n;i++); // Reescribimos restando n/2 a cada valor del if
		for (int i = 0; i < n - (n / 2); i++) {
			suma = suma + (primerValor + (i * salto));
		}

		// Acumulamos los que van desde el penúltimo (a la izq. del primero) a la
		// izquierda
		for (int i = 0; i < n / 2; i++) {
			suma = suma + (penultimoValor - (i * salto));
		}

		return suma;

	}

}
