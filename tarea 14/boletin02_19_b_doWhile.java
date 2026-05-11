package tarea14;
import javax.swing.JOptionPane;

public class boletin02_19_b_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, nota, aprobados, suspensos, condicionados;
		aprobados = 0;
		suspensos = 0;
		condicionados = 0;
		i = 1;
		do {
			nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce nota entre 0 y 10: "));
			if (nota == 4) {
				condicionados = condicionados + 1;
			} else {
				if (nota >= 5) {
					aprobados = aprobados + 1;
				} else {
					suspensos = suspensos + 1;
				}
			}
			i = i + 1;
		} while (i <= 6);
		JOptionPane.showMessageDialog(null, "Aprobados: " + aprobados);
		JOptionPane.showMessageDialog(null, "Suspensos: " + suspensos);
		JOptionPane.showMessageDialog(null, "Condicionados: " + condicionados);
		
		

	}

}
