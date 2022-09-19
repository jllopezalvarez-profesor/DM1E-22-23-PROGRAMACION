Proceso ciclista
	Definir  horaSalida, minutoSalida, segundoSalida Como Entero;
	Definir segundosViaje como entero;
	Definir  horaLlegada, minutoLlegada, segundoLlegada Como Entero;
	
	Escribir "Introduce hora de salida ";
	Leer horaSalida;
	Escribir "Introduce minuto de salida ";
	Leer minutoSalida;
	Escribir "Introduce segundo de salida ";
	Leer segundoSalida;
	
	Escribir "Introduce duración del viaje (en segundos)";
	Leer segundosViaje;
	
	Definir totalSegundosSalida Como Entero;
	totalSegundosSalida <- (horaSalida * 3600) + (minutoSalida * 60) + segundoSalida;
	
	Definir totalSegundosLlegada Como Entero;
	totalSegundosLlegada <- totalSegundosSalida + segundosViaje;
	
	minutoLlegada <- trunc(totalSegundosLlegada / 60);
	segundoLlegada <- totalSegundosLlegada % 60;
	
	horaLlegada <- trunc(minutoLlegada / 60);
	minutoLlegada <- minutoLlegada % 60;
	
	Escribir  " Llega a las ", horaLlegada, " h ", minutoLlegada, " min ", segundoLlegada, " seg";
	
	
	
	
	
	
	
FinProceso
