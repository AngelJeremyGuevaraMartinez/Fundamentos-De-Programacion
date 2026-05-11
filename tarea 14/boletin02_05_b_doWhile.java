package tarea14;
import javax.swing.JOptionPane;
public class boletin02_05_b_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, n;
		n = Integer.parseInt(JOptionPane.showInputDialog("introduce n"));
		num = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
		do {
			if (num > n) {
				JOptionPane.showMessageDialog(null, "menor");
			} else if (num < n) {
				JOptionPane.showMessageDialog(null, "mayor");
			}
			num = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
		} while (num != n);


	}

}
