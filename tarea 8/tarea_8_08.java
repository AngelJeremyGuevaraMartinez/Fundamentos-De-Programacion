import java.io.*;

public class tarea_8_08{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,d1,d4;
		System.out.println("Ingrese un numero de 4 digitos");
		n=Integer.parseInt(br.readLine());
		
		d1=n/1000;
		d4=n%10;
		
		if(d1==d4)
			System.out.println("Capicua");
		else
			System.out.println("No lo es");
	}
}
