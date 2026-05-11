Algoritmo tarea_7_4_a2243330342
	Definir cal1,cal2,cal3 Como Entero
	Definir calf Como Real
	Escribir "Ingrese la primera calificacion: "
	Leer cal1
	Escribir "Ingrese la segunda calificacion: "
	Leer cal2
	Escribir "Ingrese la tercera calificacion: "
	Leer cal3
	calf <- (cal1 + cal2 + cal3) / 3
	Si calf >= 7 Entonces
		Escribir "El alumno aprobo con una calificacion de: ", calf
	SiNo
		Escribir "El alumno reprobo con una calificacion de: ", calf
	FinSi
	
FinAlgoritmo
