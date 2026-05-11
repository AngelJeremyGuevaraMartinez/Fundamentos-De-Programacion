Algoritmo tarea_06_35
	Definir d, complemento Como Entero
	Escribir "Ingrese un digito (0 a 9)"
	Leer d
	Si d>=0 Y d<=9 Entonces
		complemento <- 10 - d
		Escribir "El complemento es: ", complemento
	SiNo
		Escribir "Error: No es un digito valido"
	FinSi
	
FinAlgoritmo
