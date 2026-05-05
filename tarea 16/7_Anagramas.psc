Algoritmo Anagramas
    Definir n,i,j Como Entero
    Definir palabras[100] Como Cadena

    Leer n
    Para i<-0 Hasta n-1
        Leer palabras[i]
    FinPara

    Para i<-0 Hasta n-1
        Para j<-i+1 Hasta n-1
            Escribir palabras[i], " ", palabras[j]
        FinPara
    FinPara
FinAlgoritmo
