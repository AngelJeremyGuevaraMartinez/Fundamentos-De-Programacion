Algoritmo tarea_06_12
	Definir N,hosts Como Entero
	Escribir "ingrese valores"
	Leer N
	
	hosts <- 2^N
	
	Si hosts > 2 Entonces
		hosts <- hosts - 2
	FinSi
	
	Escribir "Hosts disponibles:", hosts
FinAlgoritmo
