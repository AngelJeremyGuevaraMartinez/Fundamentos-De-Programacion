Algoritmo tarea_06_31
	definir cal1,cal2,cal3,promedio Como Real
	escribir "ingrese calificaciones"
	leer cal1,cal2,cal3
	promedio<-(cal1*0.2)+(cal2*0.3)+(cal3*0.5)
	escribir promedio
	si promedio>=50.0 Entonces
		escribir "escribir calificaciones satisfactoria"
	SiNo
		escribir "reprobado	"
	FinSi
FinAlgoritmo
