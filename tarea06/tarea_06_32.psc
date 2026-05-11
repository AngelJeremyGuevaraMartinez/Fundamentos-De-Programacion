Algoritmo tarea_06_32
	definir litros,k,km,costo,nvcosto Como Entero
	escribir"ingrese los km"
	leer km
	litros<-trunc(km/12)
	costo<-litros*20
	si costo>=400 Entonces
		nvcosto<-costo+100
		escribir "costo del viaje es: ",costo," costo total mas mantenimiento es: ",nvcosto
	SiNo
		escribir "costo es de: " costo
	FinSi
	
FinAlgoritmo
