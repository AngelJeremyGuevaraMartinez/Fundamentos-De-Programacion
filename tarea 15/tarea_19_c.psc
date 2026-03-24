
Algoritmo tarea_19_c
    Definir cal, suma, cont Como Entero
    Definir prom Como Real
    suma = 0
    cont = 0
    Repetir
        Leer cal
        suma = suma + cal
        cont = cont + 1
    Hasta Que cont = 3
    prom = suma / 3
    Si prom >= 7 Entonces
        Escribir "ACREDITADO"
    SiNo
        Escribir "NO ACREDITADO"
    FinSi
FinAlgoritmo
