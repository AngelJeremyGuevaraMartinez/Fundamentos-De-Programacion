import java.io.*;

public class Ejercicio13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("n: ");
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int maxDif = Integer.MIN_VALUE;
        int a=0,b=0;

        System.out.println("Diferencias:");
        for(int i=0;i<n-1;i++){
            int dif = Math.abs(arr[i] - arr[i+1]);
            System.out.println(dif);
            if(dif > maxDif){
                maxDif = dif;
                a = arr[i];
                b = arr[i+1];
            }
        }

        System.out.println("Mayor diferencia: " + maxDif + " entre " + a + " y " + b);
    }
}