Algoritmo tarea_10_2
	definir ip Como Entero
	definir salida Como Caracter
	escribir "ingrese la ip"
	leer ip	
	si (ip >= 1 Y  ip<= 126 )Entonces
		escribir"clase A"
	SiNo
		si (ip>=123 Y ip<=191) Entonces
			Escribir "clase B"
		SiNo
			si (ip>=192 Y ip<=223) Entonces
				Escribir "clase C"
			SiNo
				si (ip=127) Entonces
					escribir "direccion de loopback"
				SiNo
					si (ip>223) Entonces
						escribir "clase especial o reservada"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
