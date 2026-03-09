
import java.util.Scanner;
public class tarea_10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char tipo;
int dato;
Scanner leer = new Scanner(System.in);
System.out.println("tipo de trafico V(voz), D(datos), G(gaming)");
tipo = leer.next().charAt(0);
switch (tipo) {
case 'd':
	System.out.println("ingrese el tamaño del dato");
	dato = leer.nextInt();
	if (dato > 1000) {
		System.out.println("prioridad alta");
	} else {
		System.out.println("prioridad baja o media");
	}
	break;
	case 'v':
		System.out.println("prioridad critica");
		break;
		case 'g':
			System.out.println("prioridad alta");
			break;
			default:
				System.out.println("ERROR");
				break;
				
				
}
	}

}
