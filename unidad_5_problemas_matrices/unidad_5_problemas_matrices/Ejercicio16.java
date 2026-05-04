import java.io.*;
import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random r = new Random();

        System.out.print("n: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = r.nextInt(16) + 10;
            System.out.print(arr[i] + " ");
        }

        Map<Integer,Integer> freq = new HashMap<>();
        for(int x:arr){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }

        int max = Collections.max(freq.values());
        System.out.println("
Moda:");
        for(int k:freq.keySet()){
            if(freq.get(k)==max){
                System.out.println(k+" ("+max+" veces)");
            }
        }
    }
}