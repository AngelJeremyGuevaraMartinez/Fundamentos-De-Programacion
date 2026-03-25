Funcion mostrarmenu(menu)
	Definir opc,opc1 Como Caracter
	escribir "c,- calcular el area del circulo"
	escribir "t.- calcular	area del triangulo"
	escribir "R.- calcular el area del rectangulo"
	Escribir "A.- calcular el area del trapecio"
	escribir "s.- Salir"
FinFuncion

Funcion num<-pedirdato(mensaje)
	definir num Como Real
	escribir mensaje
	leer num
FinFuncion 

Funcion area<-calcularareacirculo(radio)
	definir area Como Real
	area <- pi()*radio*radio
FinFuncion

Funcion area<-calcularareatriangulo(base,altura)
	area<-(base*altura)/2
FinFuncion

Funcion area<-calcularectangulo(base,altura)
	area<-(base*altura)
FinFuncion

Funcion area<-calculartrapecio(baseMayor, baseMenor, altura)
	area <- (baseMayor + baseMenor) * altura / 2
FinFuncion 

Algoritmo calculoAreapseint2
	Definir op Como Caracter
	definir radio,base,altura Como Real
	mientras (op <>"s") O (op <>"S") Hacer
		
		mostrarmenu(menu)
		leer op
		op= Mayusculas(op)
		Segun op Hacer
			"C":
				radio <-pedirdato("ingrese el radio del circulo: ")
				Escribir "el area del circulo es: ",calcularareacirculo(radio)
			"T":
				base<-pedirdato("ingrese la base del triangulo: ")
				altura<-pedirdato("ingrese la altura del triangulo: ")
				escribir"el area del triangulo es: ",calcularareatriangulo(base,altura)
				
			"R":
				base<-pedirdato("ingrese la base del rectangulo: ")
				altura<-pedirdato("ingrese la altura del rectangulo: ")
				escribir"el area del rectangulo es: ",calcularectangulo(base,altura)
				
			"A":
				baseMayor<-pedirdato("ingrese la base del trapecio: ")
				baseMenor<-pedirdato("ingrese la altura del trapecio: ")
				altura<-pedirdato("ingrese la longitud del trapecio")
				escribir"el area del rectangulo es: ",calculartrapecio(baseMayor, baseMenor, altura)
				
				
			"S":
				Escribir "saliendo del programa"
				
		FinSegun
	FinMientras
FinAlgoritmo