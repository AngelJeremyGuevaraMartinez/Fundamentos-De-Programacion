Algoritmo activa_dia_13_4
	Definir trabajadores, sueldo, sueldoNuevo, nomina Como Real
	trabajadores <- 0
	sueldo <- 0
	sueldoNuevo <- 0
	nomina <- 0
	Escribir "¿Cuántos trabajadores tiene el grupo?"
	Leer trabajadores
	Mientras trabajadores > 0 Hacer
		Escribir "¿Cuál es el sueldo actual?"
		Leer sueldo
		Si sueldo < 1000 Entonces
			sueldoNuevo <- sueldo * 1.15
		SiNo
			sueldoNuevo <- sueldo * 1.12
		FinSi
		nomina <- sueldoNuevo * trabajadores
		Escribir "El nuevo sueldo del trabajador será:"
		Escribir sueldoNuevo
		trabajadores <- trabajadores - 1
	FinMientras
	Escribir "El total de nómina es:"
	Escribir nomina
	
FinAlgoritmo