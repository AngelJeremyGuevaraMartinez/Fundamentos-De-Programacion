import java.io.*;

public class tarea_8_09{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double a,b,c;
		System.out.println("Ingrese los lados del triangulo");
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
		c=Double.parseDouble(br.readLine());
		
		if(a*a+b*b==c*c)
			System.out.println("Rectangulo");
		else
			if(a*a+b*b>c*c)
				System.out.println("Acutangulo");
			else
				System.out.println("Obtusangulo");
	}
}
