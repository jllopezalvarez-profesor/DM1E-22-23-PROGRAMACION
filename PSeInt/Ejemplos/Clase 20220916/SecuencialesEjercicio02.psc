Proceso PerimetroArea
	// Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura.
	Definir base Como Real;
	Definir altura Como Real;
	Definir area como Real;
	Definir perimetro Como Real;
	
	// Pedir al usuario la base del rect�ngulo
	Escribir Sin saltar "Introduce la base del rect�ngulo ";
	Leer base;
	
	// Pedir al usuario la altura del rect�ngulo
	Escribir Sin saltar "Introduce la altura del rect�ngulo ";
	Leer altura;
	
	//C�lculo del �rea
	area <- base * altura;
	
	// C�lculo del per�metro
	perimetro <- 2 * (base+altura);
	
	Escribir "El �rea del rect�ngulo es ", area, " y su per�metro es ", perimetro;
FinProceso
