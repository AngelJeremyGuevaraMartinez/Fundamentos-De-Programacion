
import java.util.Scanner;
public class Tarea20A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            op = sc.nextInt();
            if (op >=1 && op <=3) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (op==1) System.out.println(a+b);
                if (op==2) System.out.println(a*b);
                if (op==3) System.out.println((double)a/b);
            }
        }
    }
}
