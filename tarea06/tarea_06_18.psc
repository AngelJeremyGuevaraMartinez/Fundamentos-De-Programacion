Algoritmo tarea_06_18
	Definir N,primero,ultimo,suma Como Entero
	escribir"ingrese datos"
	Leer N
	
	Si N>0 Entonces
		primero <- N / 100
		ultimo <- N MOD 10
		suma <- primero + ultimo
		Escribir suma
	FinSi
FinAlgoritmo
