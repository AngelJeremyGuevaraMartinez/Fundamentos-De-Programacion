Algoritmo tarea_8_12
	Definir d,m Como Entero
	Definir bisiesto Como Logico
	
	Leer d,m
	Leer bisiesto
	
	Si m=2 Entonces
		Si bisiesto Y d<=29 Entonces
			Escribir "Fecha Valida"
		SiNo
			Si NO bisiesto Y d<=28 Entonces
				Escribir "Fecha Valida"
			SiNo
				Escribir "Invalida"
			FinSi
		FinSi
	SiNo
		Escribir "Fecha Valida"
	FinSi
FinAlgoritmo
