import java.io.*;

public class tarea_8_02{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c,s;
		
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
		c=Double.parseDouble(br.readLine());
		
		s=a+b+c;
		
		if(s==180 && a>0 && b>0 && c>0){
			if(a==90||b==90||c==90)
				System.out.println("Rectangulo");
			else
				if(a>90||b>90||c>90)
					System.out.println("Obtusangulo");
				else
					System.out.println("Acutangulo");
		}
		else
			System.out.println("Angulos invalidos");
	}
}
