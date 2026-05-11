package tarea14;
import javax.swing.JOptionPane;

public class boletin02_05_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,n;
		n = Integer.parseInt(JOptionPane.showInputDialog("introduzca n"));
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca numero"));
		for (; num != n; ) {
			if (num > n) {
				JOptionPane.showMessageDialog(null, "menor");
			} else {
				JOptionPane.showMessageDialog(null, "mayor");
			}
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca numero"));
		}
		
	}

}
