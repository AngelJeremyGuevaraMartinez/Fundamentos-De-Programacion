package tarea14;
import javax.swing.JOptionPane;
public class boletin02_03_b_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			if (num != 0) {
				if (num % 2 == 0) {
					JOptionPane.showMessageDialog(null, "es par");
				} else {
					JOptionPane.showMessageDialog(null, "es impar");
				}
			}
		} while (num != 0);

	}

}
