Algoritmo tarea_06_7
	Definir minutos,horas Como Entero
	escribir"ingrese los minutos"
	Leer minutos
	
	horas <- trunc(minutos/60)
	
	Si minutos mod 60 > 0 Entonces
		horas <- horas+1
	FinSi
	
	Escribir "Horas a pagar:", horas
FinAlgoritmo
