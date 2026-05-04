import java.io.*;
import java.util.*;

public class Ejercicio19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        double suma=0;
        for(int i=0;i<n;i++){
            arr[i] = r.nextInt(5)+33;
            suma+=arr[i];
            System.out.print(arr[i]+" ");
        }

        double media = suma/n;
        double s=0;

        for(int x:arr){
            s += Math.pow(x-media,2);
        }

        double desv = Math.sqrt(s/(n-1));

        System.out.println("
Media: "+media);
        System.out.println("Desviación: "+desv);
    }
}