package tarea14;
import javax.swing.JOptionPane;
public class boletin02_12_b_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i, factorial;
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		factorial = 1;
		i = num;
		while (i > 0) {
			factorial = factorial * i;
			i = i - 1;
			
		}
			JOptionPane.showMessageDialog(null, "el factorial de " + num + " es: " + factorial);
		

	}

}
