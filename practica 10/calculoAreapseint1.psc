Funcion mostrarmenu(menu)
	Definir opc,opc1 Como Caracter
	escribir "c,- calcular el area del circulo"
	escribir "t.- calcular	area del triangulo"
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

Algoritmo calculoAreapseint1
	Definir op Como Caracter
	definir radio,base,altura Como Real
	Repetir
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
				
			"S":
				Escribir "saliendo del programa"
		FinSegun
	Hasta Que (op="s") O (op="S")
	
	
FinAlgoritmo
