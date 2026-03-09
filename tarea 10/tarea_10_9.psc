Algoritmo tarea_10_9
	definir codigo,admin Como Entero
	escribir "ingrese codigo, 1:.exe 2:.docx 3:.sh"
	leer codigo	
	segun codigo Hacer
		caso 1: 
			escribir "Archivo potencialmente ejecutable. ¿Tiene permisos de admin? 1.si 2.no"
			leer admin
			si admin =1 Entonces
				Escribir "tienes permiso"
			SiNo
				si admin = 2 Entonces
					Escribir "no tienes permiso papu :v"	
				FinSi
			FinSi
		caso 2:
			Escribir  "Documento de texto seguro"
		caso 3:
			escribir "Archivo potencialmente ejecutable. ¿Tiene permisos de admin? 1.si 2.no"
			leer admin
			si admin =1 Entonces
				Escribir "tienes permiso"
			SiNo
				si admin = 2 Entonces
					Escribir "no tienes permiso papu :v"	
				FinSi
			FinSi
		De Otro Modo:
			Escribir "extension no reconocida	"
	FinSegun
FinAlgoritmo
