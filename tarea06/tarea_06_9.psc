Algoritmo tarea_06_9
	Definir r,area Como Entero
	Escribir "Radio:"
	Leer r
	
	area <- trunc(3.1416 * r * r)
	
	Si area > trunc(area) Entonces
		area <- trunc(area)
	FinSi
	
	Escribir "Area:", area
FinAlgoritmo
