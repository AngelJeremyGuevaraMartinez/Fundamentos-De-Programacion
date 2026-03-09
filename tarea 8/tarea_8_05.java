import java.io.*;

public class tarea_8_05{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int y;
		System.out.println("Ingrese un año");
		y=Integer.parseInt(br.readLine());
		
		if(y%2==0 && y%10!=0 && y%4==2 && y>=2000 && y<=3000)
			System.out.println("Año de Oro");
		else
			System.out.println("Año Ordinario");
	}
}
