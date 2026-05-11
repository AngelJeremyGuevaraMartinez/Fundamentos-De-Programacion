Algoritmo tarea_06_17
	Definir N,resultado Como Entero
	escribir"ingrese datos"
	Leer N
	
	Si N>=1000 Y N<=9999 Entonces
		resultado <- (N / 10) MOD 100
		Escribir resultado
	SiNo
		Escribir "No tiene 4 digitos"
	FinSi
FinAlgoritmo
