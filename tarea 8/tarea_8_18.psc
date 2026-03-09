Algoritmo tarea_8_18
	Definir t1,t2,t3,prom Como Real
	Escribir "ingrese datos	"
	Leer t1,t2,t3
	
	Si Abs(t1-t2)>20 O Abs(t1-t3)>20 O Abs(t2-t3)>20 Entonces
		Escribir "Error de Sensor"
	SiNo
		prom <- (t1+t2+t3)/3
		Si prom >= 80 Entonces
			Escribir "Alerta de Incendio"
		SiNo
			Si prom >= 60 Entonces
				Escribir "Sobrecalentamiento"
			SiNo
				Escribir "Estado Normal"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
