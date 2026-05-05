Algoritmo Cuadrantes
    Definir n,i,x,y Como Entero
    Definir origen,q1,q2,q3,q4,ejeX,ejeY Como Entero
    origen<-0; q1<-0; q2<-0; q3<-0; q4<-0; ejeX<-0; ejeY<-0

    Leer n
    Para i<-1 Hasta n
        Leer x,y
        Si x=0 Y y=0 Entonces
            origen<-origen+1
        Sino
            Si x=0 Entonces
                ejeY<-ejeY+1
            Sino
                Si y=0 Entonces
                    ejeX<-ejeX+1
                Sino
                    Si x>0 Y y>0 Entonces
                        q1<-q1+1
                    Sino
                        Si x<0 Y y>0 Entonces
                            q2<-q2+1
                        Sino
                            Si x<0 Y y<0 Entonces
                                q3<-q3+1
                            Sino
                                q4<-q4+1
                            FinSi
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
    FinPara

    Escribir "Origen: ", origen
    Escribir "Cuadrante I: ", q1
    Escribir "Cuadrante II: ", q2
    Escribir "Cuadrante III: ", q3
    Escribir "Cuadrante IV: ", q4
    Escribir "Eje X: ", ejeX
    Escribir "Eje Y: ", ejeY
FinAlgoritmo
