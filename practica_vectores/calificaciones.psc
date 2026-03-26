Algoritmo Calificaciones
    Definir opc Como Caracter
    Definir sumapromedio, resultado, promedio Como Real
    Definir num, suma, ciclo, calif Como Entero
    Dimension calificacion[100]
    opc <- "S"
    num <- 0
    sumapromedio <- 0
    Mientras (opc = "S")
        num <- num + 1
        suma <- 0
        Para ciclo <- 1 Hasta 3 Hacer
            Escribir "Ingrese la calificación ", ciclo, " del alumno ", num, ": "
            Leer calif
            suma <- suma + calif
        FinPara
        resultado <- suma / 3
        calificacion[num] <- resultado
        Escribir "¿Desea ingresar otro alumno? (S/N): "
        Leer opc
        opc <- Mayusculas(opc)
    FinMientras
    Para ciclo <- 1 Hasta num Hacer
        Si calificacion[ciclo] >= 7 Entonces
            Escribir "Alumno ", ciclo, " calificación: ", calificacion[ciclo], " -> Acredita"
        SiNo
            Escribir "Alumno ", ciclo, " calificación: ", calificacion[ciclo], " -> NO acredita"
        FinSi
        sumapromedio <- sumapromedio + calificacion[ciclo]
    FinPara
    promedio <- sumapromedio / num
    Escribir "Promedio del grupo de ", num, " alumnos: ", promedio
	
FinAlgoritmo