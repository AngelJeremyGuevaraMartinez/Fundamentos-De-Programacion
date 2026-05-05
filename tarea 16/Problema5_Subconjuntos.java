import java.util.*;
public class Problema5_Subconjuntos {
    static char[] arr;
    static char[] res;
    static int n,k;
    public static void back(int idx, int start){
        if(idx==k){
            for(char c: res) System.out.print(c);
            System.out.println();
            return;
        }
        for(int i=start;i<n;i++){
            res[idx]=arr[i];
            back(idx+1, i+1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt(); k=sc.nextInt();
        arr=new char[n];
        for(int i=0;i<n;i++) arr[i]=sc.next().charAt(0);
        Arrays.sort(arr);
        res=new char[k];
        back(0,0);
    }
}