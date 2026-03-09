Algoritmo tarea_8_02
	definir a,b,c,may,x,n Como Real
	
	escribir "Ingrese los lados del triangulo"
	leer a,b,c
	
	Si (a+b>c) Y (a+c>b) Y (b+c>a) Entonces
		
		Si a>=b Y a>=c Entonces
			may<-a
			x<-b
			n<-c
		SiNo
			Si b>=a Y b>=c Entonces
				may<-b
				x<-a
				n<-c
			SiNo
				may<-c
				x<-a
				n<-b
			FinSi
		FinSi
		
		Si may^2 = x^2 + n^2 Entonces
			Escribir "Rectangulo"
		SiNo
			Si may^2 > x^2 + n^2 Entonces
				Escribir "Obtusangulo"
			SiNo
				Escribir "Acutangulo"
			FinSi
		FinSi
		
	SiNo
		Escribir "No forman un triangulo"
	FinSi
FinAlgoritmo
