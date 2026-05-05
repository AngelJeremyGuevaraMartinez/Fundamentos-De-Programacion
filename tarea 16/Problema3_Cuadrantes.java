import java.util.*;
public class Problema3_Cuadrantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int origen=0, q1=0,q2=0,q3=0,q4=0, ejeX=0,ejeY=0;
        for(int i=0;i<n;i++){
            int x=sc.nextInt(), y=sc.nextInt();
            if(x==0 && y==0) origen++;
            else if(x==0) ejeY++;
            else if(y==0) ejeX++;
            else if(x>0 && y>0) q1++;
            else if(x<0 && y>0) q2++;
            else if(x<0 && y<0) q3++;
            else q4++;
        }
        System.out.println("Origen: "+origen);
        System.out.println("Cuadrante I: "+q1);
        System.out.println("Cuadrante II: "+q2);
        System.out.println("Cuadrante III: "+q3);
        System.out.println("Cuadrante IV: "+q4);
        System.out.println("Eje X: "+ejeX);
        System.out.println("Eje Y: "+ejeY);
    }
}