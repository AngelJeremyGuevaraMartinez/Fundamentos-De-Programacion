Algoritmo tarea_06_11
	Definir num,d1,d2,d3,d4,suma Como Entero
	escribir"ingrese valores"
	Leer num
	
	d1 <- num mod 10
	num <- trunc(num/10)
	d2 <- num mod 10
	num <- trunc(num/10)
	d3 <- num mod 10
	num <- trunc(num/10)
	d4 <- num
	
	suma <- d1+d2+d3+d4
	
	Si suma >= 0 Entonces
		Escribir "Checksum:", suma
	FinSi
FinAlgoritmo
