import java.io.*;

public class tarea_8_11{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.println("Ingrese los puntos de A y B");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		
		if(a>=6&&b<=4)
			System.out.println("Gana A");
		else
			if(b>=6&&a<=4)
				System.out.println("Gana B");
			else
				System.out.println("En juego");
	}
}
