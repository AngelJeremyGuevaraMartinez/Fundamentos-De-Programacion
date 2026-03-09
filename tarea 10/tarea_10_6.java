
import java.util.Scanner;
public class tarea_10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int puerto;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el numero del puerto:");
		puerto = leer.nextInt();
		switch (puerto) {
		case 21:
			System.out.println("FTP: transferencia de archivos");
			break;
			case 22:
				System.out.println("SSH: acceso remoto seguro");
				break;
				case 25:
					System.out.println("SMTP: envio de correo");
					break;
					case 80:
						System.out.println("WEB http/https");
						break;
						case 443:
							System.out.println("WEB http/https");
							break;
							default:
								System.out.println("Puerto no reconocido");
								break;
								
		}
}
}