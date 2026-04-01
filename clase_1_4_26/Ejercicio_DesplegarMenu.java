
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio_DesplegarMenu {
    public static String mostrarMenu(String[] opciones) {
        String cadena = "";
        for(int i = 0; i < opciones.length; i++) {
            cadena += (i+1) + ". " + opciones[i] + "\n";
        }
        return cadena;
    }

    public static int desplegarMenu(String titulo, String[] menu) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(titulo + "\n");
        System.out.print(mostrarMenu(menu));
        System.out.print("Seleccione una opcion: ");
        return Integer.parseInt(br.readLine());
    }

    public static void main(String[] args) throws IOException {
        String[] menu = {"Opcion 1","Opcion 2","Opcion 3"};
        int op = desplegarMenu("MENU", menu);
        System.out.println("Elegiste: " + op);
    }
}
