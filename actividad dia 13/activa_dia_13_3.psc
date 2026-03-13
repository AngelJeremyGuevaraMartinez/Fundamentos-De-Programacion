Algoritmo activa_dia_13_3
	Definir numero, cubo Como Real
	numero <- 0
	cubo <- 0
	Escribir "Ingrese el número natural:"
	Leer numero
	Si numero < 0 O numero > 9 Entonces
		Escribir "El número no es natural"
	FinSi
	Mientras numero >= 0 Y numero <= 9 Hacer
		cubo <- numero ^ 3
		Escribir "El cubo del número es:"
		Escribir cubo
		Escribir "Ingresa otro número natural:"
		Leer numero
		Si numero < 0 O numero > 9 Entonces
			Escribir "El número no es natural"
		FinSi
	FinMientras
	
FinAlgoritmo