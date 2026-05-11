package tarea14;
import javax.swing.JOptionPane;
public class boletin02_07_b_while {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma, elementos;
		double media;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
		suma = 0;
		elementos = 0;
		while (num >= 0) {
			suma = suma + num;
			elementos = elementos + 1;
			num = Integer.parseInt(JOptionPane.showInputDialog("introduce otro numero"));
		}
		if (elementos > 0) {
			media = (double) suma / elementos;
			JOptionPane.showMessageDialog(null, "La media es: " + media);
		} else {
			JOptionPane.showMessageDialog(null, "No se han introducido números válidos.");
		}
		

	}

}
