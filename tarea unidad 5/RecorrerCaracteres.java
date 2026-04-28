import java.util.Scanner;

public class RecorrerCaracteres {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char[] carac = {'P','R','O','G','R','A','M','A'};
        int opcion;

        do {
            System.out.println("\n1. Derecha\n2. Izquierda\n3. Salir");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1:
                    char aux = carac[carac.length-1];
                    for(int i=carac.length-1;i>0;i--) carac[i]=carac[i-1];
                    carac[0]=aux;
                    break;
                case 2:
                    aux = carac[0];
                    for(int i=0;i<carac.length-1;i++) carac[i]=carac[i+1];
                    carac[carac.length-1]=aux;
                    break;
            }

            for(char c:carac) System.out.print(c+" ");

        } while(opcion!=3);
    }
}
