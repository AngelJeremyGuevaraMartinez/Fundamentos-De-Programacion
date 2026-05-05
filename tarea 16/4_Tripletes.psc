Algoritmo TripletesDiv3
    Definir n,i,j,k,count Como Entero
    Definir a[1000] Como Entero

    Leer n
    Para i<-0 Hasta n-1
        Leer a[i]
    FinPara

    count<-0
    Para i<-0 Hasta n-1
        Para j<-i+1 Hasta n-1
            Para k<-j+1 Hasta n-1
                Si (a[i]+a[j]+a[k]) Mod 3 = 0 Entonces
                    count<-count+1
                FinSi
            FinPara
        FinPara
    FinPara

    Escribir count
FinAlgoritmo
