
Algoritmo tarea_19_b
    Definir cal, suma, i Como Entero
    Definir prom Como Real
    suma = 0
    Para i = 1 Hasta 3
        Leer cal
        suma = suma + cal
    FinPara
    prom = suma / 3
    Si prom >= 7 Entonces
        Escribir "ACREDITADO"
    SiNo
        Escribir "NO ACREDITADO"
    FinSi
FinAlgoritmo
