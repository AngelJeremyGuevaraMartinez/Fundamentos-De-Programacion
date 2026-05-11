package tarea14;
import javax.swing.JOptionPane;
public class boletin02_13_b_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contc, contp, contn, sumap, suman, i = 0;
		double mediap, median;
		contc = 0;
		contp = 0;
		contn = 0;
		sumap = 0;
		suman = 0;
		
		
		num = Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
		while (i <= 10) {
			if (num == 0) {
				contc = contc + 1;
			} else {
				if (num > 0) {
					contp = contp + 1;
					sumap = sumap + num;
				} else {
					contn = contn + 1;
					suman = suman + num;
				}
			}
			i++;
		}
			JOptionPane.showMessageDialog(null, "el numero de ceros es de : " + contc);
			if (contp == 0) {
				JOptionPane.showMessageDialog(null, "no se puede hacer la media de los positivos");
			} else {
				mediap = (double) sumap / contp;
				JOptionPane.showMessageDialog(null, "media de los positivos: " + mediap);
			}
			if (contn == 0) {
				JOptionPane.showMessageDialog(null, "no se puede hacer la media de los negativos");
			} else {
				median = (double) suman / contn;
				JOptionPane.showMessageDialog(null, "media de los negativos: " + median);
			}
			
		

	}

}
