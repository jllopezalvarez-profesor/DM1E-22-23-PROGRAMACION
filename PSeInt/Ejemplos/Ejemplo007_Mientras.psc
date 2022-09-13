
Proceso Ejemplo007_Mientras
	Definir secreto, clave como cadena; 
	secreto <- "asdasd";
	Escribir "Dime la clave:";
	Leer clave;
	Mientras clave<>secreto Hacer // Repetimos mientras 
		// no ponga bien la contraseña. Si la contraseña 
		// es correcta a la primera no llega a entrar en la iteración.
		Escribir "Clave incorrecta!!!";
		Escribir "Dime la clave:";
		Leer clave;
	FinMientras
	Escribir "Bienvenido!!!";
	Escribir "Programa terminado"; 
FinProceso
