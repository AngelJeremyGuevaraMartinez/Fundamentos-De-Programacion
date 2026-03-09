Algoritmo tarea_10_3
	
	Definir intentos Como Entero
	Definir conocida Como Entero
	
	Escribir "Intentos fallidos:"
	Leer intentos
	
	Escribir "IP conocida? (1=Si,0=No):"
	Leer conocida
	
	Si conocida = 0 Entonces
		Si intentos > 3 Entonces
			Escribir "Bloquear IP permanentemente"
		SiNo
			Escribir "Solicitar Captcha"
		FinSi
	SiNo
		Si intentos > 10 Entonces
			Escribir "Bloquear temporalmente por 15 min"
		SiNo
			Escribir "Permitir reintento"
		FinSi
	FinSi
	
FinAlgoritmo