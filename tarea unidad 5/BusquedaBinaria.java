import java.util.Scanner;

public class BusquedaBinaria {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arreglo = new int[4];
        llenar(arreglo);
        buscar(arreglo);
    }

    static void llenar(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print("Número: ");
            arr[i]=leer.nextInt();
        }
    }

    static void buscar(int[] arr){
        System.out.print("Buscar: ");
        int num=leer.nextInt();

        int inf=0,sup=arr.length-1,mid;

        while(inf<=sup){
            mid=(inf+sup)/2;
            if(arr[mid]==num){
                System.out.println("Encontrado en posición "+mid);
                return;
            }else if(arr[mid]<num) inf=mid+1;
            else sup=mid-1;
        }
        System.out.println("No encontrado");
    }
}
