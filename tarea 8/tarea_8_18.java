import java.io.*;

public class tarea_8_18 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double t1,t2,t3,prom;
		System.out.println("Ingrese las temperaturas de los tres sensores");
		t1 = Double.parseDouble(br.readLine());
		t2 = Double.parseDouble(br.readLine());
		t3 = Double.parseDouble(br.readLine());
		
		if(Math.abs(t1-t2)>20 || Math.abs(t1-t3)>20 || Math.abs(t2-t3)>20)
			System.out.println("Error de Sensor");
		else{
			prom = (t1+t2+t3)/3;
			if(prom>=80)
				System.out.println("Alerta de Incendio");
			else
				if(prom>=60)
					System.out.println("Sobrecalentamiento");
				else
					System.out.println("Estado Normal");
		}
	}
}
