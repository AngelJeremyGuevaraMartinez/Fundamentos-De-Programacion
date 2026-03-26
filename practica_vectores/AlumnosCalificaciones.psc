Algoritmo AlumnosCalificaciones
	
    Definir ciclo, i, pos Como Entero
    Definir aux1, aux2, aux3 Como Entero
    Definir resultado, sumaPromedio, promedio Como Real
    Definir auxNombre Como Cadena
	
    Definir nombre Como Cadena
    Definir calificaciones Como Entero
	
    Dimension nombre[5]
    Dimension calificaciones[15]
	
    pos <- 0    
	
    Para ciclo <- 0 Hasta 4 Hacer
        
        Escribir "Introduce el nombre del alumno ", ciclo+1, ": "
        Leer nombre[ciclo]
		
        Para i <- 0 Hasta 2 Hacer
            Escribir "Calificación ", i+1, ": "
            Leer calificaciones[pos]
            pos <- pos + 1
        FinPara
		
    FinPara
    
    Para ciclo <- 0 Hasta 3 Hacer
        
        pos <- 0
        
        Para i <- 0 Hasta 3 Hacer
            
            Si nombre[i] > nombre[i+1] Entonces
                
                auxNombre <- nombre[i]
                nombre[i] <- nombre[i+1]
                nombre[i+1] <- auxNombre
				
                aux1 <- calificaciones[pos]
                aux2 <- calificaciones[pos+1]
                aux3 <- calificaciones[pos+2]
				
                calificaciones[pos] <- calificaciones[pos+3]
                calificaciones[pos+1] <- calificaciones[pos+4]
                calificaciones[pos+2] <- calificaciones[pos+5]
				
                calificaciones[pos+3] <- aux1
                calificaciones[pos+4] <- aux2
                calificaciones[pos+5] <- aux3
				
            FinSi
			
            pos <- pos + 3
            
        FinPara
        
    FinPara
	
    pos <- 0
    sumaPromedio <- 0
	
    Para ciclo <- 0 Hasta 4 Hacer
        
        resultado <- (calificaciones[pos] + calificaciones[pos+1] + calificaciones[pos+2]) / 3
        
        Escribir nombre[ciclo], " -> ", calificaciones[pos], ", ", calificaciones[pos+1], ", ", calificaciones[pos+2], " | Promedio: ", resultado
        
        sumaPromedio <- sumaPromedio + resultado
        pos <- pos + 3
		
    FinPara
	
    promedio <- sumaPromedio / 5
	
    Escribir "Promedio general del grupo: ", promedio
	
FinAlgoritmo