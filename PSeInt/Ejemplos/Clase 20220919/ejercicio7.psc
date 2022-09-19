Proceso ejercicio7_versionClase
	Definir totalMinutos Como Entero;
	Escribir "Introduce el número total de minutos";
	Leer totalMinutos;
	
	Definir minutos, horas Como Entero;
	
//	horas <- trunc( totalMinutos / 60);
	//	minutos <- totalMinutos % 60;
	
	horas <- trunc( totalMinutos / 60);
	Definir minutosHorasCompletas como entero;
	
	minutosHorasCompletas <- 60 * horas;
	
	minutos <- totalMinutos-minutosHorasCompletas;
	Escribir "--------------------------";
	
	// Versión con dos alternativas
	Si minutos > 0 Entonces
		Escribir  totalMinutos,  " son ", horas, " horas y ", minutos, " minutos.";
	SiNo
		Escribir  totalMinutos,  " son ", horas, " horas.";
	FinSi
	
	Escribir "--------------------------";
	
	// Versión con una alternativa
	Escribir Sin Saltar totalMinutos,  " son ", horas, " horas";
	Si minutos > 0 Entonces
		Escribir Sin Saltar " y ", minutos, " minutos";
	FinSi
	
	Escribir  ".";
	Escribir "--------------------------";
	
	
	
	
FinProceso
