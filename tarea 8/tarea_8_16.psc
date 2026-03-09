Algoritmo tarea_8_16
	Definir ip Como Cadena
	Definir puerto Como Entero
	Definir protocolo Como Cadena
	Escribir "Ingrese IP de origen:"
	Leer ip
	Escribir "Ingrese puerto:"
	Leer puerto
	Escribir "Ingrese protocolo (TCP/UDP):"
	Leer protocolo
	Si ip = "192.168.1.50" Entonces
		Escribir "Tráfico Bloqueado"
	SiNo
		Si puerto = 80 O puerto = 443 Entonces
			Si protocolo = "TCP" Entonces
				Escribir "Tráfico Permitido"
			SiNo
				Escribir "Tráfico Bloqueado"
			FinSi
		SiNo
			Si puerto = 53 Entonces
				Si protocolo = "UDP" Entonces
					Escribir "Tráfico Permitido"
				SiNo
					Escribir "Tráfico Bloqueado"
				FinSi
			SiNo
				Escribir "Tráfico Bloqueado"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
