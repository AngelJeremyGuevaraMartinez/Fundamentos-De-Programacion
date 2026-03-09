Algoritmo tarea_8_06
	Definir x1,y1,x2,y2,px,py Como Real
	
	Leer x1,y1,x2,y2
	Leer px,py
	
	Si (px>=x1 Y px<=x2) Y (py>=y1 Y py<=y2) Entonces
		Si (px=x1 O px=x2 O py=y1 O py=y2) Entonces
			Escribir "Borde"
		SiNo
			Escribir "Dentro"
		FinSi
	SiNo
		Escribir "Fuera"
	FinSi
FinAlgoritmo
