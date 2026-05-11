Algoritmo tarea_7_5_a2243330342
	Definir ope1,ope2,op Como Entero
	Definir resultado Como Real
	Escribir "Ingrese el primer numero: "
	Leer ope1
	Escribir "Ingrese el segundo numero: "
	Leer ope2
	Escribir "Menu de operaciones:"
	Escribir "1. Suma"
	Escribir "2. Multiplicacion"
	Escribir "3. Division"
	Leer op
	Si op = 1 Entonces
		resultado <- ope1 + ope2
		Escribir "El resultado de la suma es: ", resultado
	SiNo
		Si op = 2 Entonces
			resultado <- ope1 * ope2
			Escribir "El resultado de la multiplicacion es: ", resultado
		SiNo
			Si op = 3 Entonces
				Si ope2 <> 0 Entonces
					resultado <- ope1 / ope2
					Escribir "El resultado de la division es: ", resultado
				SiNo
					Escribir "No se puede dividir entre cero"
				FinSi
			SiNo
				Escribir "Opcion no valida"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
