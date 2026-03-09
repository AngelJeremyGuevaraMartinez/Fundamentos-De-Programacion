
import java.util.Scanner;
public class tarea_10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leer = new Scanner(System.in);

  int intentos,conocida;
  System.out.println("Intentos fallidos:");
  intentos=leer.nextInt();
  
  System.out.println("IP conocida? (1=Si,0=No):");
  conocida=leer.nextInt();
  
  if (conocida == 0) {
	  if (intentos > 3) {
		  System.out.println("Bloquear IP permanentemente");
	  } else {
		  System.out.println("Solicitar Captcha");
	  }
  } else {
	  if (intentos > 10) {
		  System.out.println("Bloquear temporalmente por 15 min");
	  } else {
		  System.out.println("Permitir reintento");
	  }
  }
	}

}
