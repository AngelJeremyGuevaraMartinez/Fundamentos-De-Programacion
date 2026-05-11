Algoritmo tarea_06_23
	Definir R,cajas,sobra Como Entero
	escribir"ingrese valores"
	Leer R
	
	cajas <- trunc (R/6)
	sobra <- R -(cajas*6)
	
	Si sobra>0 Entonces
		Escribir "Sobran:", sobra
	FinSi
FinAlgoritmo
