import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=leer.nextInt();

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(int x:arr) System.out.print(x+" ");
    }
}
