Algoritmo Frecuencia
    Definir cad Como Cadena
    Definir freq[26], i, pos, max Como Entero
    Definir letra Como Caracter

    Leer cad

    Para i<-0 Hasta 25
        freq[i]<-0
    FinPara

    Para i<-0 Hasta Longitud(cad)-1
        pos <- ASCII(Subcadena(cad,i,i)) - ASCII("a")
        freq[pos] <- freq[pos] + 1
    FinPara

    max<-0
    letra<-"a"

    Para i<-0 Hasta 25
        Si freq[i] > max Entonces
            max <- freq[i]
            letra <- Caracter(i + ASCII("a"))
        FinSi
    FinPara

    Escribir letra, " ", max
FinAlgoritmo
