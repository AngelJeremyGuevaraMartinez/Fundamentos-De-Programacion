Algoritmo tarea_06_6
	Definir seg,horas,minutos,segundos Como Entero
	escribir"ingrese los segundos"
	Leer seg
	
	horas <- trunc(seg/3600)
	seg <- seg mod 3600
	
	minutos <- trunc(seg/60)
	segundos <- seg mod 60
	
	Escribir horas," horas ",minutos," minutos ",segundos," segundos"
FinAlgoritmo
