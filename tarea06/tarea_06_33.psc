Algoritmo tarea_06_33
	definir c,km,k Como real
	escribir "ingrese los cm"
	
	leer c	
	k<-c*500
	si k >= 1000 Entonces
		km<-k/1000
		escribir "son ",km," kilometros" 
	SiNo
		escribir "son ",k," metros"
	FinSi
FinAlgoritmo
