Algoritmo tarea_06_16
	Definir N,central Como Entero
	escribir "ingrese datos"
	Leer N
	
	Si N>=100 Y N<=999 Entonces
		central <- (N / 10) MOD 10
		Escribir "Digito central:", central
	SiNo
		Escribir "No es de 3 cifras"
	FinSi
FinAlgoritmo
