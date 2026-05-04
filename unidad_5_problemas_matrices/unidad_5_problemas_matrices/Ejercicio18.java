import java.io.*;
import java.util.*;

public class Ejercicio18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = r.nextInt(51);
            System.out.print(arr[i]+" ");
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("
Mayor="+max);
        for(int i=0;i<n;i++) if(arr[i]==max) System.out.print(i+" ");

        System.out.println("
Menor="+min);
        for(int i=0;i<n;i++) if(arr[i]==min) System.out.print(i+" ");
    }
}