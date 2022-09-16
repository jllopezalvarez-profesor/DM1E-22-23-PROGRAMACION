Proceso PerimetroArea
	// Calcular el perímetro y área de un rectángulo dada su base y su altura.
	Definir base Como Real;
	Definir altura Como Real;
	Definir area como Real;
	Definir perimetro Como Real;
	
	// Pedir al usuario la base del rectángulo
	Escribir Sin saltar "Introduce la base del rectángulo ";
	Leer base;
	
	// Pedir al usuario la altura del rectángulo
	Escribir Sin saltar "Introduce la altura del rectángulo ";
	Leer altura;
	
	//Cálculo del área
	area <- base * altura;
	
	// Cálculo del perímetro
	perimetro <- 2 * (base+altura);
	
	Escribir "El área del rectángulo es ", area, " y su perímetro es ", perimetro;
FinProceso
