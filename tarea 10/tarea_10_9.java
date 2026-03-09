import java.util.Scanner;
public class tarea_10_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		  int codigo,admin;
		  System.out.println("ingrese codigo, 1:.exe 2:.docx 3:.sh");
		  codigo=leer.nextInt();
		  switch (codigo) {
		  	case 1:
		  		System.out.println("Archivo potencialmente ejecutable. ¿Tiene permisos de admin? 1.si 2.no");
		  		admin=leer.nextInt();
		  		if (admin == 1) {
		  			System.out.println("tienes permiso");
		  		} else if (admin == 2) {
		  			System.out.println("no tienes permiso papu :v");
		  		}
		  		break;
		  	case 2:
		  		System.out.println("Documento de texto seguro");
		  		break;
		  	case 3:
		  		System.out.println("Archivo potencialmente ejecutable. ¿Tiene permisos de admin? 1.si 2.no");
		  		admin=leer.nextInt();
		  		if (admin == 1) {
		  			System.out.println("tienes permiso");
		  		} else if (admin == 2) {
		  			System.out.println("no tienes permiso papu :v");
		  		}
		  		break;
		  	default:
		  		System.out.println("extension no reconocida");
		  }
		  

	}

}
