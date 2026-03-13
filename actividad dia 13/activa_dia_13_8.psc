Algoritmo activa_dia_13_8
	Definir serie, contador Como Entero
	serie <- 0
	contador <- 0
	Escribir "Serie de números:"
	
	Mientras serie < 1800 Hacer
		
		serie <- serie + 2
		contador <- contador + serie
		Escribir serie
		
		serie <- serie + 3
		contador <- contador + serie
		Escribir serie
		
	FinMientras
	
	Escribir "La suma de todos los términos es:"
	Escribir contador
	
FinAlgoritmo