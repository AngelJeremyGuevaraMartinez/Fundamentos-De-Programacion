Algoritmo clase_06_a2243330342
	Definir Px1, Py1, Px2, Py2, Px3, Py3, Px4, Py4 Como Entero
	Definir s1, s2, s3 Como Entero
	Px1 <- 1
	Py1 <- 2
	Px2 <- 4
	Py2 <- 5
	Px3 <- 6
	Py3 <- 2
	Escribir "Introduce el valor del punto a buscar X:"
	Leer Px4
	Escribir "Introduce el valor del punto a buscar Y:"
	Leer Py4
	s1 <- (Px2 - Px1) * (Py4 - Py1) - (Py2 - Py1) * (Px4 - Px1)
	s2 <- (Px3 - Px2) * (Py4 - Py2) - (Py3 - Py2) * (Px4 - Px2)
	s3 <- (Px1 - Px3) * (Py4 - Py3) - (Py1 - Py3) * (Px4 - Px3)
	Si ( (s1 > 0 Y s2 > 0 Y s3 > 0) O (s1 < 0 Y s2 < 0 Y s3 < 0) ) Entonces
		Escribir "ESTA DENTRO"
	SiNo
		Escribir "ESTA FUERA"
		Escribir "s1=", s1, " s2=", s2, " s3=", s3
	FinSi
	
FinAlgoritmo
