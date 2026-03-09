Algoritmo tarea_8_17
	Definir long Como Entero
	Definir tieneMayus, tieneNum, tieneEsp Como Logico
	Escribir "Ingrese longitud:"
	Leer long
	Escribir "Tiene mayúsculas? (1=SI,0=NO)"
	Leer tieneMayus
	Escribir "Tiene números? (1=SI,0=NO)"
	Leer tieneNum
	Escribir "Tiene caracteres especiales? (1=SI,0=NO)"
	Leer tieneEsp
	Si long < 8 Entonces
		Escribir "Insegura"
	SiNo
		Si tieneMayus Y tieneNum Y tieneEsp Entonces
			Escribir "Muy Fuerte"
		SiNo
			Si tieneMayus O tieneNum O tieneEsp Entonces
				Escribir "Fuerte"
			SiNo
				Escribir "Débil"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
