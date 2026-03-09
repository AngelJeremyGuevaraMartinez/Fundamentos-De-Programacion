Algoritmo tarea08_01_b
	definir w,division  Como Entero
	definir salida Como Caracter
	salida<-""
	escribir"introduce cuanto pesa la sandia"
	leer w
	division<-trunc(w/2)
	si w>2 Entonces
		
	
	si (w mod 2=0)	Entonces
		salida<-"la sandia se dividio en 2 partes iguales con el peso "+ConvertirATexto(division)
	SiNo
		salida<-"la sandia se dividio en 2 partes una parte peso "+ ConvertirATexto(division) 
		salida<-salida+" la otra parte peso " + ConvertirATexto(w-division) 
		
	FinSi 
SiNo
	salida<-"la sandia se dividio en 2 partes iguales con el peso de un kilo "
FinSi

	escribir salida
FinAlgoritmo
