import java.io.*;

public class tarea_8_15{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double e1,e2,e3,p;
		System.out.println("Ingrese las calificaciones de los tres exámenes");
		e1=Double.parseDouble(br.readLine());
		e2=Double.parseDouble(br.readLine());
		e3=Double.parseDouble(br.readLine());
		
		p=(e1+e2+e3)/3;
		
		if(p>90&&(e1==100||e2==100||e3==100))
			System.out.println("Oro con Honores");
		else
			if(p>90)
				System.out.println("Oro");
			else
				if(p>=80)
					System.out.println("Plata");
				else
					System.out.println("Sin medalla");
	}
}
