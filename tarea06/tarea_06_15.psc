Algoritmo tarea_06_15
	Definir D,V,tiempo Como Entero
	Escribir "Distancia:"
	Leer D
	Escribir "Velocidad:"
	Leer V
	
	tiempo <- D / V
	
	Si D MOD V > 0 Entonces
		tiempo <- tiempo + 1
	FinSi
	
	Escribir "Tiempo total:", tiempo
FinAlgoritmo
