
Algoritmo tarea_20_a
    Definir op, a, b Como Entero
    Definir res Como Real
    op = 0
    Mientras op <> 4
        Leer op
        Si op>=1 Y op<=3 Entonces
            Leer a
            Leer b
        FinSi
        Segun op Hacer
            1: res=a+b
            2: res=a*b
            3: res=a/b
        FinSegun
    FinMientras
FinAlgoritmo
