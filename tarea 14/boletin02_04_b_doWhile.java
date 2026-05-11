package tarea14;
import javax.swing.JOptionPane;
public class boletin02_04_b_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, contador;
		contador = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			if (num > 0) {
				contador = contador + 1;
			}
		} while (num > 0);
		JOptionPane.showMessageDialog(null, "se ha introducido : " + contador + " numeros");
	}

}
