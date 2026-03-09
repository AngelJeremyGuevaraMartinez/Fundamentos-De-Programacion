import java.io.*;

public class tarea_8_10{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int f1,c1,f2,c2;
		System.out.println("Ingrese las coordenadas de la primera torre");
		f1=Integer.parseInt(br.readLine());
		c1=Integer.parseInt(br.readLine());
		f2=Integer.parseInt(br.readLine());
		c2=Integer.parseInt(br.readLine());
		
		if(f1==f2||c1==c2)
			System.out.println("Valido");
		else
			System.out.println("Invalido");
	}
}
