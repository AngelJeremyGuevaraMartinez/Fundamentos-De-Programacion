import java.io.*;

public class tarea_8_19 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int octeto;
		System.out.print("Ingrese el primer octeto de la dirección IP: ");
		octeto = Integer.parseInt(br.readLine());
		
		if(octeto>=1 && octeto<=127){
			if(octeto==10)
				System.out.println("Clase A - Privada");
			else
				System.out.println("Clase A - Publica");
		}
		else
			if(octeto>=128 && octeto<=191){
				if(octeto==172)
					System.out.println("Clase B - Privada");
				else
					System.out.println("Clase B - Publica");
			}
			else
				if(octeto>=192 && octeto<=223){
					if(octeto==192)
						System.out.println("Clase C - Privada");
					else
						System.out.println("Clase C - Publica");
				}
	}
}
