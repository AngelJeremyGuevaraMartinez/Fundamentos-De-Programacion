Algoritmo tarea_8_08
	Definir n,d1,d2,d3,d4 Como Entero
	
	Leer n
	
	Si n>=1000 Y n<=9999 Entonces
		
		d1 <- n DIV 1000
		d2 <- (n DIV 100) MOD 10
		d3 <- (n DIV 10) MOD 10
		d4 <- n MOD 10
		
		Si d1=d4 Y d2=d3 Entonces
			Escribir "Es capicua"
		SiNo
			Escribir "No lo es"
		FinSi
		
	SiNo
		Escribir "El numero debe ser de 4 cifras"
	FinSi
	
FinAlgoritmo
