Algoritmo tarea_06_4
	Definir cantidad,entrega,perdida Como Entero
	
	escribir "cantidad"
	Leer cantidad
	
	entrega <- trunc(cantidad/100)*100
	
	Si cantidad > entrega Entonces
		perdida <- cantidad-entrega
		Escribir "Se pierden:", perdida
	FinSi
	
	Escribir "Entrega:", entrega
FinAlgoritmo
