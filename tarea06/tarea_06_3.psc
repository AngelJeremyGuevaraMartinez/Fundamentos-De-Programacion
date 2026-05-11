Algoritmo tarea_06_3
	Definir X,cajas,sueltos Como Entero
	escribir "ingrese datos"
	Leer X
	
	cajas <- trunc(X/12)
	sueltos <- X-(cajas*12)
	
	Escribir "Cajas:", cajas
	Escribir "Sueltos:", sueltos
FinAlgoritmo
