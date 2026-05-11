package tarea14;
import javax.swing.JOptionPane;

public class boletin02_12_a_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, factorial;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		factorial = 1;
		for (int i = num; i > 0; i--) {
			factorial = factorial * i;
		}
		JOptionPane.showMessageDialog(null, "el factorial de " + num + " es: " + factorial);
		

	}

}
