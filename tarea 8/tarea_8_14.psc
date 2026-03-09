Algoritmo tarea_8_14
	Definir temp,hum Como Real
	Escribir "ingrese temperatura"
	Leer temp,hum
	
	Si temp>30 Y hum>80 Entonces
		Escribir "Sofocante"
	SiNo
		Si temp<15 Y hum>80 Entonces
			Escribir "Frio Humedo"
		SiNo
			Escribir "Clima Normal"
		FinSi
	FinSi
FinAlgoritmo
