Algoritmo tarea_9_04b
	definir ciclo,divisor,dividiendo,residuo Como Entero
	ciclo<-0
	escribir"introduce el valor de divisor"
	leer divisor
	escribir"introduce el valor el dividiendo"
	leer dividiendo	
	residuo<-dividiendo
	Repetir
		residuo<-residuo-divisor
		ciclo<-ciclo+1
	Hasta Que divisor>residuo
	escribir "el cociente= ",ciclo," residuo ",residuo
FinAlgoritmo
