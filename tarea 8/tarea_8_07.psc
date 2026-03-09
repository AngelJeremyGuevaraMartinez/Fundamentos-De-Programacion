Algoritmo tarea_8_07
	Definir x1,y1,x2,y2,r1,r2,d Como Real
	
	Leer x1,y1
	Leer x2,y2
	Leer r1,r2
	
	d <- (x2-x1)^2 + (y2-y1)^2
	
	Si d < (r1+r2)^2 Entonces
		Escribir "Intersectan"
	SiNo
		Si d = (r1+r2)^2 Entonces
			Escribir "Tangentes"
		SiNo
			Escribir "No se tocan"
		FinSi
	FinSi
FinAlgoritmo
