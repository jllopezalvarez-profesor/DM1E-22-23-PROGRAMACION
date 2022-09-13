
Proceso Ejemplo008_Hasta
	Definir secreto, clave como cadena; 
	secreto <- "asdasd";
	
	Repetir
		// Al menos se entra una vez dentro de la iteración
		Escribir "Dime la clave:"; 
		Leer clave;
		Si clave<>secreto Entonces 
			// Sólo si la respuesta era incorrecta mostramos error.
			Escribir "Clave incorrecta!!!"; 
		FinSi
	Hasta Que clave=secreto // Cuando ha escrito bien la contraseña salimos
	
	Escribir "Bienvenido!!!";
	Escribir "Programa terminado"; 
FinProceso


