import java.util.Scanner;
public class tarea_9_ejercicio2_12 {



	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	        double altura, base, area;

	        System.out.println("Introduce la Base: ");
	        base = entrada.nextDouble();

	        System.out.println("Introduce la Altura: ");
	        altura = entrada.nextDouble();

	        area = base * altura;

	        System.out.println("El area es = " + area);
	    }
	}


