import java.util.*;
public class Problema1_PuntosCercanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int dx = x[i]-x[j];
                int dy = y[i]-y[j];
                int dist = dx*dx + dy*dy;
                if(dist < min) min = dist;
            }
        }
        System.out.println(min);
    }
}