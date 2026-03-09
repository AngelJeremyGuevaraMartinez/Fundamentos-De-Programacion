
	import javax.swing.*;
public class tarea_9_ejercicio3_12 {

	

	    public static void main(String[] args) {

	        double altura, base, area;
	        String entrada;

	        entrada = JOptionPane.showInputDialog("Introduce la base: ");
	        base = Double.parseDouble(entrada);

	        entrada = JOptionPane.showInputDialog("Introduce la altura: ");
	        altura = Double.parseDouble(entrada);

	        area = base * altura;

	        JOptionPane.showMessageDialog(null, "El area es = " + area);
	    }
	}


