Algoritmo tarea_10_5
	definir hora,vold Como Entero
	escribir "ingrese la hora"
	leer hora
	escribir"ingrese el tamaño del volumen en GB"
	leer vold	
	si (hora>=2 Y hora<=5 ) Entonces
		si vold>50 Entonces
			escribir "Alerta: posible exfiltracion de datos"
		sino 
			escribir"trafico normal"
		FinSi
	SiNo
		si vold>50 Entonces
			escribir "Alerta: congestion de red"
		sino 
			escribir"trafico bajo control"
		FinSi
	FinSi
	
FinAlgoritmo
