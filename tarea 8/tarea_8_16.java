import java.io.*;

public class tarea_8_16 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ip,protocolo;
		int puerto;
		
		System.out.print("Ingrese IP: ");
		ip = br.readLine();
		
		System.out.print("Ingrese puerto: ");
		puerto = Integer.parseInt(br.readLine());
		
		System.out.print("Ingrese protocolo: ");
		protocolo = br.readLine();
		
		if(ip.equals("192.168.1.50"))
			System.out.println("Tráfico Bloqueado");
		else
			if((puerto==80 || puerto==443) && protocolo.equals("TCP"))
				System.out.println("Tráfico Permitido");
			else
				if(puerto==53 && protocolo.equals("UDP"))
					System.out.println("Tráfico Permitido");
				else
					System.out.println("Tráfico Bloqueado");
	}
}
