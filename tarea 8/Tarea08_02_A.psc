Algoritmo tarea08_2
	definir a,b,c Como entero
	definir Salida Como Caracter
	Escribir "Introduce el valor del angulo a"
	Leer a
	Escribir "Introduce el valor del angulo b"
	Leer b
	Escribir "Introduce el valor del angulo c"
	Leer c
	
	Si ((a + b + c) = 180) Y ((a > 0) Y (b > 0) Y (c > 0)) Entonces
		Si ((a=90) o (b=90) o (c=90)) Entonces
			salida <- "Triangulo rectangulo"
			Sino 
				Si ((a=b) y (b=c)) Entonces
					salida <- "Triangulo equilatero"
					Sino
						Si ((a > 90) o (b > 90) o (c>90)) Entonces
							salida  <- "Triangulo Obtusangulo"
							sino 
								si ((a < 90) y (b< 90) y (c<90)) Entonces
									Salida <- "Triangulo acutangulo"
								FinSi
					    FinSi
					
		
				FinSi
					
				FinSi
		
			
		
	sino
		salida <- "No es un triangulo, Angulos incorrectos"
	FinSi
	Escribir salida
	
FinAlgoritmo
