Algoritmo tarea_06_13
	Definir ID,res Como Entero
	escribir "ingrese id"
	Leer ID
	
	res <- ID mod 3
	
	Si res = 0 Entonces
		Escribir "Servidor A"
	FinSi
	
	Si res = 1 Entonces
		Escribir "Servidor B"
	FinSi
	
	Si res = 2 Entonces
		Escribir "Servidor C"
	FinSi
FinAlgoritmo
