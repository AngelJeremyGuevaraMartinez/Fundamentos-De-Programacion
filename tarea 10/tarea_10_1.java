import java.io.*;
public class tarea_10_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int paquete,protocolo;
		
		System.out.println("Ingrese el tamaño del paquete en bytes");
		paquete = Integer.parseInt(br.readLine());
		
		System.out.println("1.ICMP  2.TCP");
		System.out.println("Ingrese el tipo de protocolo");
		protocolo = Integer.parseInt(br.readLine());
		
		if(protocolo==1) {
			if(paquete>=65535)
				System.out.println("Ataque ping de la muerte");
			else
				System.out.println("Ping normal");
		}
		else if(protocolo==2) {
			System.out.println("Paquete TCP normal");
		}
	}
}