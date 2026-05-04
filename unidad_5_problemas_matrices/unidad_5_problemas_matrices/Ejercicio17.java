import java.io.*;

public class Ejercicio17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        String[] nombres = new String[n];
        int[][] cal = new int[n][m];
        double[] prom = new double[n];

        for(int i=0;i<n;i++){
            nombres[i] = br.readLine();
            int suma=0;
            for(int j=0;j<m;j++){
                cal[i][j] = Integer.parseInt(br.readLine());
                suma += cal[i][j];
            }
            prom[i] = (double)suma/m;
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(nombres[j].compareTo(nombres[j+1])>0){
                    String aux=nombres[j]; nombres[j]=nombres[j+1]; nombres[j+1]=aux;
                    double ap=prom[j]; prom[j]=prom[j+1]; prom[j+1]=ap;
                    int[] tmp=cal[j]; cal[j]=cal[j+1]; cal[j+1]=tmp;
                }
            }
        }

        double total=0;
        for(int i=0;i<n;i++){
            System.out.print(nombres[i]+" ");
            for(int j=0;j<m;j++) System.out.print(cal[i][j]+" ");
            System.out.println(prom[i]);
            total+=prom[i];
        }
        System.out.println("Promedio grupo: "+(total/n));
    }
}