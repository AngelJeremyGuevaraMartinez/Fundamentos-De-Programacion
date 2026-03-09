Algoritmo tarea_10_7
	definir accion,riesgo Como entero
	escribir "ingrese "
	leer accion
	escribir"riesgo"
	leer riesgo	
	segun accion Hacer
		caso 1: 
			si riesgo>7 Entonces
				escribir "advertencia trafico peligroso"
			SiNo
				escribir "trafico seguro"
			FinSi
		caso 2:
			escribir "paquete descartado"
		caso 3:
			escribir "paquete aislado para analisis"
	FinSegun
FinAlgoritmo
