Algoritmo tarea_8_19
	Definir octeto Como Entero
	Escribir "Ingrese primer octeto:"
	Leer octeto
	Si octeto>=1 Y octeto<=127 Entonces
		Si octeto=10 Entonces
			Escribir "Clase A - Privada"
		SiNo
			Escribir "Clase A - Publica"
		FinSi
	SiNo
		Si octeto>=128 Y octeto<=191 Entonces
			Si octeto=172 Entonces
				Escribir "Clase B - Privada"
			SiNo
				Escribir "Clase B - Publica"
			FinSi
		SiNo
			Si octeto>=192 Y octeto<=223 Entonces
				Si octeto=192 Entonces
					Escribir "Clase C - Privada"
				SiNo
					Escribir "Clase C - Publica"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
