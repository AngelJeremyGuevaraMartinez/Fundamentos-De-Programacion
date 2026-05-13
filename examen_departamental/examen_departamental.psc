Funcion valido <- textonovacio(text)
    Definir valido Como Logico
    Si Longitud(text) > 0 Entonces
        valido <- Verdadero
    SiNo
        valido <- Falso
    FinSi
FinFuncion

Funcion valido <- validarnumero(text)
    Definir valido Como Logico
    Definir i Como Entero
    Definir c Como Caracter
    valido <- Verdadero
    Si Longitud(text) = 0 Entonces
        valido <- Falso
    SiNo
        Para i <- 0 Hasta Longitud(text) - 1 Hacer
            c <- Subcadena(text, i, i)
            Si c < "0" O c > "9" Entonces
                valido <- Falso
            FinSi
        FinPara
    FinSi
FinFuncion


Funcion prom <- promediogeneral(calificacion, n)
    Definir i, j Como Entero
    Definir suma Como Real
    suma <- 0
    Para i <- 0 Hasta n - 1 Hacer
        Para j <- 0 Hasta 1 Hacer
            suma <- suma + calificacion[i, j]
        FinPara
    FinPara
    prom <- suma / (n * 2)
FinFuncion


Funcion promalumno <- promedioalumno(calificacion, fila)
    Definir promalumno Como Real
    promalumno <- (calificacion[fila, 0] + calificacion[fila, 1]) / 2
FinFuncion

Funcion prom <- PromedioAsignatura(calificacion, n, col)
    Definir i Como Entero
    Definir suma Como Real
    suma <- 0
    Para i <- 0 Hasta n - 1 Hacer
        suma <- suma + calificacion[i, col]
    FinPara
    prom <- suma / n
FinFuncion
Funcion valido <- validarnombre(text)
    Definir valido Como Logico
    Definir i Como Entero
    Definir c Como Caracter
	
    valido <- Verdadero
    Si Longitud(text) = 0 Entonces
        valido <- Falso
    SiNo
        Para i <- 0 Hasta Longitud(text) - 1 Hacer
            c <- Subcadena(text, i, i)
            Si c >= "0" Y c <= "9" Entonces
                valido <- Falso
            FinSi
        FinPara
    FinSi
FinFuncion

Algoritmo examen_departamental
    Definir alum, edad, n, i, j, calif Como Entero
    Definir prom Como Real
    Definir nombres, text Como Cadena
    Definir ok Como Logico
    Definir calificacion Como Entero
    Dimension nombres[100]
    Dimension calificacion[100,2]
	
    Escribir "Ingrese el numero de alumnos"
    Leer n
    Para i <- 0 Hasta n - 1 Hacer
		Repetir
			Escribir "Ingrese el nombre del alumno"
			Leer nombres[i]
			
			Si validarnombre(nombres[i]) Entonces
				ok <- Verdadero
			SiNo
				Escribir "Dato no valido"
				ok <- Falso
			FinSi
		Hasta Que ok
        Para j <- 0 Hasta 1 Hacer
            Repetir
                Escribir "Ingrese la calificacion"
                Leer text
                ok <- validarnumero(text)
                Si ok Entonces
                    calif <- ConvertirANumero(text)
					
                    Si calif < 1 O calif > 10 Entonces
                        Escribir "La calificacion debe estar entre 1 y 10"
                        ok <- Falso
                    SiNo
                        calificacion[i, j] <- calif
                    FinSi
                SiNo
                    Escribir "Dato no valido"
                FinSi
            Hasta Que ok
        FinPara
    FinPara
	
    prom <- promediogeneral(calificacion, n)
    Escribir "El promedio general del grupo es: ", prom
    Para i <- 0 Hasta n - 1 Hacer
        Escribir "Alumno: ", nombres[i]
        Escribir "Calificacion 1: ", calificacion[i, 0]
        Escribir "Calificacion 2: ", calificacion[i, 1]
        Escribir "El promedio: ", promedioalumno(calificacion, i)
    FinPara
    Escribir "Promedio de la asignatura 1: ", PromedioAsignatura(calificacion, n, 0)
    Escribir "Promedio de la asignatura 2: ", PromedioAsignatura(calificacion, n, 1)
	
FinAlgoritmo