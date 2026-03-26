Algoritmo OperacionesMatrices
	//como ejecutar comandos ms2 en java 
    Definir op Como Entero
    Definir A, B, C Como Entero
    Definir i, j Como Entero
    Definir AA, BB Como Logico
	
    Dimension A[2,2]
    Dimension B[2,2]
    Dimension C[2,2]
	
    AA <- Falso
    BB <- Falso
	
    Repetir
		
        Escribir "===== MENU DE MATRICES ====="
        Escribir "1.- Agregar elementos matriz A"
        Escribir "2.- Agregar elementos matriz B"
        Escribir "3.- Suma de matrices"
        Escribir "4.- Resta de matrices"
        Escribir "5.- Multiplicacion de matrices"
        Escribir "6.- Salir"
        Escribir "Seleccione una opcion: "
        Leer op
		
        Segun op Hacer
			
            1:
                Para i <- 0 Hasta 1 Hacer
                    Para j <- 0 Hasta 1 Hacer
                        Escribir "A[", i, ",", j, "]: "
                        Leer A[i,j]
                    FinPara
                FinPara
                AA <- Verdadero
				
            2:
                Para i <- 0 Hasta 1 Hacer
                    Para j <- 0 Hasta 1 Hacer
                        Escribir "B[", i, ",", j, "]: "
                        Leer B[i,j]
                    FinPara
                FinPara
                BB <- Verdadero
				
            3:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    
                    Para i <- 0 Hasta 1 Hacer
                        Para j <- 0 Hasta 1 Hacer
                            C[i,j] <- A[i,j] + B[i,j]
                        FinPara
                    FinPara
					
                    Escribir "Suma de matrices:"
                    Para i <- 0 Hasta 1 Hacer
                        Para j <- 0 Hasta 1 Hacer
                            Escribir Sin Saltar C[i,j], " "
                        FinPara
                        Escribir ""
                    FinPara
					
                SiNo
                    Escribir "Primero debes ingresar ambas matrices"
                FinSi
				
            4:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    
                    Para i <- 0 Hasta 1 Hacer
                        Para j <- 0 Hasta 1 Hacer
                            C[i,j] <- A[i,j] - B[i,j]
                        FinPara
                    FinPara
					
                    Escribir "Resta de matrices:"
                    Para i <- 0 Hasta 1 Hacer
                        Para j <- 0 Hasta 1 Hacer
                            Escribir Sin Saltar C[i,j], " "
                        FinPara
                        Escribir ""
                    FinPara
					
                SiNo
                    Escribir "Primero debes ingresar ambas matrices"
                FinSi
				
            5:
                Si (AA = Verdadero) Y (BB = Verdadero) Entonces
                    
                    // Multiplicación de matrices 2x2
                    C[0,0] <- (A[0,0]*B[0,0]) + (A[0,1]*B[1,0])
                    C[0,1] <- (A[0,0]*B[0,1]) + (A[0,1]*B[1,1])
                    C[1,0] <- (A[1,0]*B[0,0]) + (A[1,1]*B[1,0])
                    C[1,1] <- (A[1,0]*B[0,1]) + (A[1,1]*B[1,1])
					
                    Escribir "Multiplicacion de matrices:"
                    Para i <- 0 Hasta 1 Hacer
                        Para j <- 0 Hasta 1 Hacer
                            Escribir Sin Saltar C[i,j], " "
                        FinPara
                        Escribir ""
                    FinPara
					
                SiNo
                    Escribir "Primero debes ingresar ambas matrices"
                FinSi
				
            6:
                Escribir "Adios, que tengas un buen dia"
				
            De Otro Modo:
                Escribir "No existe esa opcion"
				
        FinSegun
		
    Hasta Que op = 6
	
FinAlgoritmo