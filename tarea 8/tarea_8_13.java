import java.io.*;

public class tarea_8_13{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int kg;
		System.out.println("Ingrese el peso del boxeador");
		kg=Integer.parseInt(br.readLine());
		
		if(kg<=52)
			System.out.println("Mosca");
		else
			if(kg<=63)
				System.out.println("Ligero");
			else
				if(kg<=75)
					System.out.println("Mediano");
				else
					if(kg<=91)
						System.out.println("Pesado");
					else
						System.out.println("Super pesado");
	}
}
