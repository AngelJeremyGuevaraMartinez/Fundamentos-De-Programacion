import java.io.*;

public class tarea_8_12{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int d,m;
		boolean b;
		System.out.println("Ingrese el dia, mes y si el año es bisiesto");
		d=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		b=Boolean.parseBoolean(br.readLine());
		
		if(m==2){
			if((b&&d<=29)||(!b&&d<=28))
				System.out.println("Fecha valida");
			else
				System.out.println("Invalida");
		}
		else
			if(d<=31)
				System.out.println("Fecha valida");
			else
				System.out.println("Invalida");
	}
}
