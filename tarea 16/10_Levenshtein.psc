Algoritmo Levenshtein
    Definir a,b Como Cadena
    Definir i,j Como Entero
    Definir dp[101,101] Como Entero

    Leer a
    Leer b

    Para i<-0 Hasta Longitud(a)
        dp[i,0] <- i
    FinPara

    Para j<-0 Hasta Longitud(b)
        dp[0,j] <- j
    FinPara

    Para i<-1 Hasta Longitud(a)
        Para j<-1 Hasta Longitud(b)
            Si Subcadena(a,i-1,i-1) = Subcadena(b,j-1,j-1) Entonces
                dp[i,j] <- dp[i-1,j-1]
            Sino
                dp[i,j] <- 1 + Min(dp[i-1,j-1], Min(dp[i-1,j], dp[i,j-1]))
            FinSi
        FinPara
    FinPara

    Escribir dp[Longitud(a), Longitud(b)]
FinAlgoritmo
