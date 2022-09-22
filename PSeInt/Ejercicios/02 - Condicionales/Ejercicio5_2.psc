Proceso login
	Definir secreto, clave como cadena;
	Definir NUMINTENTOS, contador como entero;
	
	NUMINTENTOS <- 3;
	contador <- 0;
	
	secreto <- "asdasd";
	Repetir
		Escribir "Dime la clave:";
		Leer clave;
		Si clave<>secreto Entonces
			Escribir "Clave incorrecta!!!";
			contador <- contador + 1;
		FinSi
	Hasta Que clave=secreto O contador = NUMINTENTOS
	
	Si clave=secreto Entonces
		Escribir "Bienvenido!!!";
	Sino
		Escribir "No tienes acceso!!!";
	FinSi
	
	Escribir "Programa terminado";
FinProceso