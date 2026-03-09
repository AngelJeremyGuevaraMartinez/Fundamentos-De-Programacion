Algoritmo tarea_10_10
	definir op ,rango,cifra Como Entero
	Escribir "MENU DE HERRAMIENTAS"
	Escribir "1.Escanear Red"
	Escribir "2.Verificar Firewall"
	Escribir "3.Cifrar Mensaje"
	Escribir "4.Salir"
	leer op
	Segun op Hacer
		caso 1:
			Escribir "escribe un rango	"
			leer rango	
			si rango >0 Entonces
				escribir "escaneo"
			SiNo
				escribir"error"	
			FinSi
		caso 2:
			Escribir "Estado: Activo"
		caso 3:
			Escribir "ingrese cifra 1 o 2"
			leer cifra 
			si cifra=1 Entonces
				Escribir "Cifrado César"
			SiNo
				si cifra=2 Entonces
					Escribir  "Cifrado AES"
				FinSi
			FinSi
		caso 4:
			Escribir "Cerrando sesión"
	FinSegun
FinAlgoritmo
