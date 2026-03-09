Algoritmo tarea_8_15
	Definir e1, e2, e3, prom Como Real
	Escribir "Ingrese la calificación del examen 1:"
	Leer e1
	Escribir "Ingrese la calificación del examen 2:"
	Leer e2
	Escribir "Ingrese la calificación del examen 3:"
	Leer e3
	prom <- (e1 + e2 + e3) / 3
	Si prom >= 90 Entonces
		Si e1 = 100 O e2 = 100 O e3 = 100 Entonces
			Escribir "Oro con Honores"
		SiNo
			Escribir "Oro"
		FinSi
	SiNo
		Si prom >= 80 Y prom < 90 Entonces
			Escribir "Plata"
		SiNo
			Escribir "Sin medalla"
		FinSi
	FinSi
FinAlgoritmo
