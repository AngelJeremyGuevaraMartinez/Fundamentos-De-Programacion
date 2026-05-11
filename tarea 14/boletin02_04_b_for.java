package tarea14;
import javax.swing.JOptionPane;
public class boletin02_04_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		contador = 0;
		for (; num > 0; ) {
			contador = contador + 1;
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		}
		JOptionPane.showMessageDialog(null, "se ha introducido : " + contador + " numeros");
		
	}

}
