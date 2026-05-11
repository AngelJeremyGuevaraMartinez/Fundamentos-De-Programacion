Algoritmo tarea_06_34

	Definir x, resultado Como Real
	
	Escribir "Ingrese un numero"
	Leer x
	
	resultado <- rc(x*x)
	
	Si resultado = x Entonces
		Escribir "El numero ya era positivo"
	SiNo
		Escribir "El valor absoluto es: ", resultado
	FinSi
	
FinAlgoritmo
