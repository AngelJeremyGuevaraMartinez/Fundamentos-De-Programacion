import java.io.*;

public class Ejercicio11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n: ");
        int n = Integer.parseInt(br.readLine());

        String[] nombres = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Nombre: ");
            nombres[i] = br.readLine().toUpperCase();
        }

        // burbuja
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nombres[j].compareTo(nombres[j+1]) > 0){
                    String aux = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = aux;
                }
            }
        }

        System.out.println("Ordenados:");
        for(String nom : nombres){
            System.out.println(nom);
        }
    }
}