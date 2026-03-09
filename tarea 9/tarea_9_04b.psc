Algoritmo tarea_9_04b
	definir numero1,numero2,numero3,resultado Como entero
	escribir "introduce el primer numero: "
	leer numero1
	escribir"introduce el numero dos"
	leer numero2
	escribir"introduce el numero tres"
	leer numero3
	si numero1<0 Entonces
		resultado<-numero1*numero2*numero3
	SiNo
		resultado<-numero1+numero2+numero3	
	FinSi
	escribir"el resultado es: ",resultado
FinAlgoritmo
