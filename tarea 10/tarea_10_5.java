import java.util.Scanner;
public class tarea_10_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora,vold;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la hora:");
		hora = leer.nextInt();
		System.out.println("Ingrese el tamaño del volumen en GB:");
		vold = leer.nextInt();
		if (hora >= 2 && hora <= 5) {
			if (vold > 50) {
				System.out.println("Alerta: posible exfiltracion de datos");
			} else {
				System.out.println("Tráfico normal");
			}
		} else {
			if (vold > 50) {
				System.out.println("Alerta: congestión de red");
			} else {
				System.out.println("Tráfico bajo control");
			}
		}

	}

}
