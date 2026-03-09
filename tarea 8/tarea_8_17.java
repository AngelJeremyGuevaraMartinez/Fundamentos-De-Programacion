import java.io.*;

public class tarea_8_17 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int longitud,mayus,num,esp;
		
		System.out.print("Longitud: ");
		longitud = Integer.parseInt(br.readLine());
		
		System.out.print("Tiene mayusculas (1/0): ");
		mayus = Integer.parseInt(br.readLine());
		
		System.out.print("Tiene numeros (1/0): ");
		num = Integer.parseInt(br.readLine());
		
		System.out.print("Tiene especiales (1/0): ");
		esp = Integer.parseInt(br.readLine());
		
		if(longitud<8)
			System.out.println("Insegura");
		else
			if(mayus==1 && num==1 && esp==1)
				System.out.println("Muy Fuerte");
			else
				if(mayus==1 || num==1 || esp==1)
					System.out.println("Fuerte");
				else
					System.out.println("Debil");
	}
}
