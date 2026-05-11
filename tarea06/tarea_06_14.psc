Algoritmo tarea_06_14
	Definir secreto,llave,res Como Entero
	
	Leer secreto
	Leer llave
	
	res <- secreto + llave
	
	Si res >= 10 Entonces
		res <- res - 10
	FinSi
	
	Escribir "Resultado:", res
FinAlgoritmo
