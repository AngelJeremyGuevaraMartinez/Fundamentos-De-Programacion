import java.io.*;

public class tarea_8_20 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tipo;
		double latencia;
		
		System.out.print("Tipo: ");
		tipo = br.readLine();
		
		System.out.print("Latencia: ");
		latencia = Double.parseDouble(br.readLine());
		
		if(tipo.equals("Voz") || tipo.equals("Video")){
			if(latencia<50)
				System.out.println("Prioridad Alta");
			else
				System.out.println("Prioridad Media");
		}
		else
			if(tipo.equals("Descarga")){
				if(latencia<150)
					System.out.println("Prioridad Baja");
				else
					System.out.println("Prioridad Minima");
			}
	}
}
