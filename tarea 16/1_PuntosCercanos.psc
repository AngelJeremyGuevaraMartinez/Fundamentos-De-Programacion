Algoritmo PuntosCercanos
    Definir n,i,j Como Entero
    Definir x[1000], y[1000] Como Entero
    Definir dx,dy,dist,min Como Entero

    Leer n
    Para i<-0 Hasta n-1
        Leer x[i], y[i]
    FinPara

    min <- 999999999

    Para i<-0 Hasta n-1
        Para j<-i+1 Hasta n-1
            dx <- x[i] - x[j]
            dy <- y[i] - y[j]
            dist <- dx*dx + dy*dy
            Si dist < min Entonces
                min <- dist
            FinSi
        FinPara
    FinPara

    Escribir min
FinAlgoritmo
