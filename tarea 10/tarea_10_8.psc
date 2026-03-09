Algoritmo tarea_10_8
	definir tipo Como Caracter
	definir dato Como Entero
	
	escribir "tipo de trafico V(voz), D(datos), G(gaming)"
	leer tipo
	Segun tipo Hacer
		Caso "d":
			escribir "ingrese el tamaño del dato"
			leer dato
			si dato>1000 Entonces
				escribir "prioridad alta"
			SiNo
				escribir "prioridad baja o media"
			FinSi
		Caso "v":
			escribir "prioridad critica"
		Caso "g":
			escribir "prioridad alta"
		De Otro Modo:
			escribir "ERROR"
			
	FinSegun
FinAlgoritmo