package tarea14;
import javax.swing.JOptionPane;
public class boletin02_02_b_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			do {
				if (num > 0) {
					JOptionPane.showMessageDialog(null, "es positivo");
				} else if (num < 0) {
					JOptionPane.showMessageDialog(null, "es negativo");
				}
				num = Integer.parseInt(JOptionPane.showInputDialog("introduzca otro numero"));
			} while (num != 0);

	}

}
