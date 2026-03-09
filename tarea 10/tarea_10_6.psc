Algoritmo tarea_10_6
	definir puerto como entero 
	escribir "ingrese el numero del puerto "
	leer puerto
	segun puerto Hacer
		caso 21 :
			escribir "FTP: transferencia de archivos"
		caso 22 :
			escribir"SSH: acceso remoto seguro"
		caso 25 :
		escribir "SMTP: envio de correo"
	caso 80 : 
		escribir"WEB http/https"
	caso 443:
		escribir"WEB http/https"
	De Otro Modo:
		escribir "puerto no reconocido"
	FinSegun
FinAlgoritmo
