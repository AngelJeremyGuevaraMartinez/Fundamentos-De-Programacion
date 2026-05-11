package tarea14;
import javax.swing.JOptionPane;


public class boletin02_01_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cuadrado;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			for (; num >= 0; ) {
			cuadrado = num * num;
			JOptionPane.showMessageDialog(null, num + " es igual a " + cuadrado);
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca otro numero"));
		}

	}

}
