package tarea14;
import javax.swing.JOptionPane;

public class boletin02_14_b_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldo, suma, mayor_1000, i;
		suma = 0;
		mayor_1000 = 0;
		for (i = 1; i <= 10; i++) {
			sueldo = Integer.parseInt(JOptionPane.showInputDialog("introduce un sueldo"));
			if (sueldo > 1000) {
				mayor_1000 = mayor_1000 + 1;
				suma = suma + sueldo;
			}
		}
		JOptionPane.showMessageDialog(null, "mayores de 1000 hay: " + mayor_1000);
		JOptionPane.showMessageDialog(null, "la suma es de: " + suma);
		
		

	}

}
