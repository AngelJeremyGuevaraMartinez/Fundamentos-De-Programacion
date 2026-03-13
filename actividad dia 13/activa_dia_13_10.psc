Algoritmo activa_dia_13_9
	
	Definir numero, resultado, contador Como Entero
	
	resultado <- 1
	
	Escribir "Ingrese el número:"
	Leer numero
	
	Para contador <- 1 Hasta numero Con Paso 1 Hacer
		
		resultado <- contador * resultado
		
	FinPara
	
	Escribir "El factorial es:"
	Escribir resultado
	
FinAlgoritmo