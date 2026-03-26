Algoritmo VectoresOrdenados
    Definir datos Como Entero
    Definir generados, num, naleatorio Como Entero
    Definir ciclo, ciclop, aux Como Entero
    Definir movimiento Como Logico
    Dimension datos[10]
    generados <- 0
    num <- 0
    Mientras num < 10 Hacer
        naleatorio <- Aleatorio(0,40)
        generados <- generados + 1
        Si (naleatorio > 0) Y (naleatorio MOD 2 = 0) Entonces
            datos[num] <- naleatorio
            num <- num + 1
        FinSi
    FinMientras
    Escribir "De ", generados, " números generados, este es el arreglo con 10 elementos:"
    Para ciclo <- 0 Hasta 9 Hacer
        Escribir Sin Saltar datos[ciclo], " "
    FinPara
    Escribir ""
    Escribir "Ordenando..."
    ciclop <- 0
    movimiento <- Verdadero
    Mientras (ciclop < 10) Y (movimiento = Verdadero) Hacer
        movimiento <- Falso
        Para ciclo <- 0 Hasta 8 Hacer
            Si datos[ciclo] > datos[ciclo + 1] Entonces
                aux <- datos[ciclo + 1]
                datos[ciclo + 1] <- datos[ciclo]
                datos[ciclo] <- aux
                movimiento <- Verdadero
            FinSi
        FinPara
        ciclop <- ciclop + 1
    FinMientras
    Escribir "Arreglo ordenado:"
    Para ciclo <- 0 Hasta 9 Hacer
        Escribir Sin Saltar datos[ciclo], " "
	FinPara
	
FinAlgoritmo