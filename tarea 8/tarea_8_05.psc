Algoritmo tarea_8_05
	Definir n Como Entero
	
	Escribir "Ingrese el año:"
	Leer n
	
	Si (n MOD 2 = 0) Y (n MOD 10 <> 0) Y (n MOD 4 = 2) Y (n>=2000 Y n<=3000) Entonces
		Escribir "Año de Oro"
	SiNo
		Escribir "Año Ordinario"
	FinSi
FinAlgoritmo
