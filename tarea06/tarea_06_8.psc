Algoritmo tarea_06_8
	Definir N,D,U,nuevo Como Entero
	
	Escribir "Ingrese numero de 2 cifras"
	Leer N
	
	D <- trunc(N/10)
	U <- N mod 10
	
	nuevo <- U*10 + D
	
	Escribir "Numero invertido:", nuevo
FinAlgoritmo
