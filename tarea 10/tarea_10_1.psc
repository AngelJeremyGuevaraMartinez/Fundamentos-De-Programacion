Algoritmo tarea_10_1
	definir paquete ,protocolo Como Entero
	Escribir "ingrese el tamaño del paquete en bytes"
	leer paquete
	escribir"1.ICMP  2.TCP"
	Escribir "ingrese el tipo de protocolo"	
	leer protocolo	
	si protocolo=1 Entonces
		si paquete >= 65535 Entonces
			Escribir "ataque ping de la muerte"
		sino 
			Escribir "ping normal	"
		FinSi
	SiNo
		si protocolo=2 Entonces
			Escribir "paquete 	ICMP normal"
		FinSi
	FinSi
FinAlgoritmo
