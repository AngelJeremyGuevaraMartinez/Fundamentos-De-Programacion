package tarea14;
import javax.swing.JOptionPane;


public class boletin02_10_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, sumat, i;
		sumat = 0;
		for (i = 1; i <= 15; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
			sumat = sumat + num;
		}
		JOptionPane.showMessageDialog(null, "la suma total es de: " + sumat);
			

	}

}
