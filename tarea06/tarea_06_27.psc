Algoritmo tarea_06_27
	Definir S,horas Como Entero
	escribir"ingrese dalores"
	Leer S
	
	horas <- trunc (S/3600)
	
	Si horas>24 Entonces
		horas <- horas MOD 24
	FinSi
	
	Escribir horas
FinAlgoritmo
