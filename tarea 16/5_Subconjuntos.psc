Algoritmo Subconjuntos
    Definir n,k,i Como Entero
    Definir arr[10], res[10] Como Caracter

    Leer n,k
    Para i<-0 Hasta n-1
        Leer arr[i]
    FinPara

    SubProceso back(idx, inicio)
        Definir j Como Entero
        Si idx = k Entonces
            Para j<-0 Hasta k-1
                Escribir Sin Saltar res[j]
            FinPara
            Escribir ""
        Sino
            Para j<-inicio Hasta n-1
                res[idx] <- arr[j]
                back(idx+1, j+1)
            FinPara
        FinSi
    FinSubProceso

    back(0,0)
FinAlgoritmo
