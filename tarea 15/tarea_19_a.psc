
Algoritmo tarea_19_a
    Definir cal, suma, cont Como Entero
    Definir prom Como Real
    suma = 0
    cont = 0
    Mientras cont < 3
        Leer cal
        suma = suma + cal
        cont = cont + 1
    FinMientras
    prom = suma / 3
    Si prom >= 7 Entonces
        Escribir "ACREDITADO"
    SiNo
        Escribir "NO ACREDITADO"
    FinSi
FinAlgoritmo
