package tarea14;
import javax.swing.JOptionPane;
public class boletin02_06_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma;
		suma = 0;
		for (;;) {
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			suma = suma + num;
			if (num == 0) {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "la suma de todos los numero es " + suma);
		

		
	}

}
