

Proceso Ejemplo006_Condicionales
	// Definimos la variable para la nota
	Definir nota como entero;
	// Preguntamos la nota al usuario
	Escribir "Dime tu nota:";
	Leer nota;
	// En función del valor de la nota, mostramos la calificación
	Segun nota Hacer
		1,2,3,4: Escribir "Suspenso";
		5: Escribir "Suficiente";
		6,7: Escribir "Bien";
		8: Escribir "Notable"; 
		9,10: Escribir "Sobresaliente"; 
		De Otro Modo: Escribir "Nota incorrecta";
	FinSegun
	Escribir "Programa terminado"; 
FinProceso



