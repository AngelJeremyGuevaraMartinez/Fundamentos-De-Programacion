Algoritmo tarea_06_10
	Definir A,B Como Entero
	escribir"ingrese valores:"
	Leer A
	Leer B
	
	A <- A + B
	B <- A - B
	A <- A - B
	
	Si A <> B Entonces
		Escribir "Valores intercambiados"
	FinSi
	
	Escribir "A:", A
	Escribir "B:", B
FinAlgoritmo
