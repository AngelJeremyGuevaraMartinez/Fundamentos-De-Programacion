Algoritmo tarea_06_1
	Definir H,R,S,dias Como Real
	
	
	Escribir "Altura del pozo:"
	Leer H
	Escribir "Sube:"
	Leer S
	Escribir "Resbala:"
	Leer R
	
	Si S >= H Entonces
		dias <- 1
	SiNo
		dias <- trunc((H-R-1)/(S-R))+1
	FinSi
	
	Escribir "Dias:", dias
FinAlgoritmo
