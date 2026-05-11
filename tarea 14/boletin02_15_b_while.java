package tarea14;
import javax.swing.JOptionPane;
public class boletin02_15_b_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i = 0, edad, mayor_edad, mayor_175;
			double altura, suma_edad, suma_alt, media_edad, media_altura;
			mayor_edad = 0;
			mayor_175 = 0;
			suma_edad = 0;
			suma_alt = 0;
			while (i <= 5) {
				JOptionPane.showMessageDialog(null, "Alumno " + i);
				edad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca edad: "));
				altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca altura: "));
				if (edad > 18) {
					mayor_edad = mayor_edad + 1;
				}
				if (altura > 1.75) {
					mayor_175 = mayor_175 + 1;
				}
				suma_edad = suma_edad + edad;
				suma_alt = suma_alt + altura;
				i = i + 1;
			}
			media_edad = suma_edad / 5;
			media_altura = suma_alt / 5;
			JOptionPane.showMessageDialog(null, "La edad media es: " + media_edad);
			JOptionPane.showMessageDialog(null, "La altura media es: " + media_altura);
			JOptionPane.showMessageDialog(null, "Mayores de 18 años: " + mayor_edad);
			JOptionPane.showMessageDialog(null, "Mayores de 1.75 m: " + mayor_175);
			

	}

}
