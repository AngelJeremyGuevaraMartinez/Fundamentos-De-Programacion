Algoritmo tarea_06_2
	Definir N,K,Q,capitan Como Entero
	
	Leer N
	Leer K
	
	Q <- trunc(N/K)
	capitan <- N-(Q*K)
	
	Escribir "Cada uno:", Q
	Escribir "Capitan:", capitan
FinAlgoritmo
