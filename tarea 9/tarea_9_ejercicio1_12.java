import java.io.*;
public class tarea_9_ejercicio1_12 {


	    public static void main(String[] args) throws IOException {

	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	        double altura, base, area;

	        System.out.println("Introduce la Base: ");
	        base = Double.parseDouble(entrada.readLine());

	        System.out.println("Introduce la Altura: ");
	        altura = Double.parseDouble(entrada.readLine());

	        area = base * altura;

	        System.out.println("El area es = " + area);
	    }
	}


