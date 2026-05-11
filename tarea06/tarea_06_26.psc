Algoritmo tarea_06_26
	Definir X,semanas,resto Como Entero
	escribir"ingrese datos"
	Leer X
	
	semanas <- trunc (X/7)
	resto <- X MOD 7
	
	Si semanas=1 Entonces
		Escribir semanas," semana"
	SiNo
		Escribir semanas," semanas"
	FinSi
	
	Escribir "Dias restantes:", resto
FinAlgoritmo
