Proceso ejercicio15
	Definir numAlumnos Como Entero;
	
	Escribir Sin Saltar "�Cu�ntos alumnos van a hacer la excursi�n? ";
	Leer numAlumnos;
	
	Definir importe como Entero;
	Definir importeAlumno Como Real;
	
	Si (numAlumnos >= 100) Entonces
		importe <- numAlumnos * 65;
		importeAlumno <- 65;
	SiNo
		Si (numAlumnos <100 y numAlumnos >=50) Entonces
			importe <- numAlumnos * 70;
			importeAlumno <- 70;
		SiNo
			Si (numAlumnos <50 y numAlumnos >=30) Entonces
				importe <- numAlumnos * 95;
				importeAlumno <- 95;
			SiNo
				importe <- 4000;
				importeAlumno <- 4000 / numAlumnos;
			FinSi
		FinSi
	FinSi
	
	Escribir 'El importe total del viaje es de ', importe, ' euros.';
	Escribir "Cada alumno paga ", importeAlumno;
	
FinProceso
