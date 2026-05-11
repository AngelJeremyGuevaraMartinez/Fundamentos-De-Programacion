package tarea14;
import javax.swing.JOptionPane;


public class boletin02_07_a_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma, elementos;
		double media;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		suma = 0;
		elementos = 0;
		for (; num >= 0; ) {
			suma = suma + num;
			elementos = elementos + 1;
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca otro numero"));
		}
		if (elementos > 0) {
			media = (double) suma / elementos;
			JOptionPane.showMessageDialog(null, "la media es " + media);
		} else {
			JOptionPane.showMessageDialog(null, "no se han introducido numeros positivos");
		}
		

	}

}
