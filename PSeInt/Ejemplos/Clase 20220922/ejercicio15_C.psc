Proceso ejercicio15
	Definir numAlumnos Como Entero;
	
	Escribir Sin Saltar "¿Cuántos alumnos van a hacer la excursión? ";
	Leer numAlumnos;
	
	Definir importe como Entero;
	Definir importeAlumno Como Real;
	
	Si (numAlumnos >= 100) Entonces
		importe <- numAlumnos * 65;
		//importeAlumno <- 65;
	SiNo
		// El número de alumnos es con toda seguridad < 100, porque estamos en el sino de >= 100
		// Si (numAlumnos <100 y numAlumnos >=50) Entonces // Esto no es necesario
		Si (numAlumnos >=50) Entonces
			importe <- numAlumnos * 70;
			//importeAlumno <- 70;
		SiNo
			// El número de alumnos es con toda seguridad < 50, porque estamos en el sino de >= 50
			// Si (numAlumnos <50 y numAlumnos >=30) Entonces // Esto no es necesario
			Si (numAlumnos >=30) Entonces
				importe <- numAlumnos * 95;
				//importeAlumno <- 95;
			SiNo
				importe <- 4000;
				//importeAlumno <- 4000 / numAlumnos;
			FinSi
		FinSi
	FinSi
	
	importeAlumno <- importe / numAlumnos;
	
	Escribir 'El importe total del viaje es de ', importe, ' euros.';
	Escribir "Cada alumno paga ", importeAlumno;
	
FinProceso
