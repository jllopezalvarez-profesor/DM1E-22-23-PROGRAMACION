
Proceso Ejemplo007_Mientras
	Definir secreto, clave como cadena; 
	secreto <- "asdasd";
	Escribir "Dime la clave:";
	Leer clave;
	Mientras clave<>secreto Hacer // Repetimos mientras 
		// no ponga bien la contrase�a. Si la contrase�a 
		// es correcta a la primera no llega a entrar en la iteraci�n.
		Escribir "Clave incorrecta!!!";
		Escribir "Dime la clave:";
		Leer clave;
	FinMientras
	Escribir "Bienvenido!!!";
	Escribir "Programa terminado"; 
FinProceso
