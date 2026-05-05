Algoritmo Permutaciones
    Definir cad Como Cadena
    Definir usado[10] Como Logico

    Leer cad

    SubProceso perm(pref)
        Definir i Como Entero
        Si Longitud(pref) = Longitud(cad) Entonces
            Escribir pref
        Sino
            Para i<-0 Hasta Longitud(cad)-1
                Si No usado[i] Entonces
                    usado[i] <- Verdadero
                    perm(pref + Subcadena(cad,i,i))
                    usado[i] <- Falso
                FinSi
            FinPara
        FinSi
    FinSubProceso

    perm("")
FinAlgoritmo
