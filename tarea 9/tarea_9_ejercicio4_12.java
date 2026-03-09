	import java.io.*;
public class tarea_9_ejercicio4_12 {
	    public static void main(String[] args) throws IOException {

	        int numero;
	        int dm, um, c, d, u;

	        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Introduzca un numero entre 0 y 99,999: ");
	        numero = Integer.parseInt(entrada.readLine());

	        dm = numero / 10000;
	        numero = numero % 10000;

	        um = numero / 1000;
	        numero = numero % 1000;

	        c = numero / 100;
	        numero = numero % 100;

	        d = numero / 10;
	        numero = numero % 10;

	        u = numero;

	        System.out.println(u + " " + d + " " + c + " " + um + " " + dm);

	        numero = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;

	        System.out.println(numero);
	    }
	}


