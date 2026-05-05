import java.util.*;
public class Problema8_Palindromos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            String rev=new StringBuilder(s).reverse().toString();
            System.out.println(s.equals(rev)?"SI":"NO");
        }
    }
}