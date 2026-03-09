Algoritmo tarea_10_4
	definir octeto1,octeto2 Como Entero
	escribir "ingrese el segundo octeto"
	leer octeto1
	escribir "ingrese el tercer octeto"
	leer octeto2
	si octeto1=0 Entonces
		si octeto2=5 Entonces
			Escribir "acceso concedido a contabilidad"
		SiNo
			escribir"acceso denegado:subred incorrecta"
		FinSi
	SiNo
		si octeto1<>0 Entonces
			Escribir "acesso denegado: red externa	"
		FinSi
	FinSi
	
FinAlgoritmo
