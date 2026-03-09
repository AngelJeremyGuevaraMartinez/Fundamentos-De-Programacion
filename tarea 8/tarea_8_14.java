import java.io.*;

public class tarea_8_14{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t,h;
		System.out.println("Ingrese la temperatura y la humedad");
		t=Integer.parseInt(br.readLine());
		h=Integer.parseInt(br.readLine());
		
		if(t>30&&h>80)
			System.out.println("Sofocante");
		else
			if(t<15&&h>80)
				System.out.println("Frio Humedo");
	}
}
