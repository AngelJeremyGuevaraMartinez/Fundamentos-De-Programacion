Algoritmo AreaPoligono
    Definir n,i,j Como Entero
    Definir x[1000], y[1000] Como Entero
    Definir area Como Real

    Leer n
    Para i<-0 Hasta n-1
        Leer x[i], y[i]
    FinPara

    area <- 0
    Para i<-0 Hasta n-1
        j <- (i+1) Mod n
        area <- area + (x[i]*y[j] - x[j]*y[i])
    FinPara

    area <- Abs(area) / 2
    Escribir area
FinAlgoritmo
