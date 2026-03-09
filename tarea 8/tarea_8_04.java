import java.io.*;

public class tarea_8_04{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int edad,fuerza;
		double vision;
		System.out.println("Ingrese edad, fuerza y vision");
		edad=Integer.parseInt(br.readLine());
		fuerza=Integer.parseInt(br.readLine());
		vision=Double.parseDouble(br.readLine());
		
		if(edad>=18&&edad<=25){
			if(fuerza>80&&vision>=0.8)
				System.out.println("Fuerzas especiales");
			else
				if(fuerza>50)
					System.out.println("Infanteria");
				else
					System.out.println("No apto");
		}
		else
			if(edad>25){
				if(vision>0.9)
					System.out.println("Estratega");
				else
					System.out.println("No apto");
			}
	} 
}
