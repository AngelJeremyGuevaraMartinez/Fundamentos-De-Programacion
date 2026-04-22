import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a2243330342_productointegrador {

    public static String Mostrarmenu(String[] menu) {
        String cadena = "";

        for (int i = 0; i < menu.length; i++) {
            cadena += (i + 1) + ".- " + menu[i] + "\n";
        }

        return cadena;
    }

    public static String Dialogo(String texto) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); 
        String cadena;

        System.out.print(texto + ": ");
        cadena = leer.readLine();

        return cadena;
    }

    public static String DesplegarMenu(String titulo1, String[] menu) throws IOException {
        String cadena;

        cadena = titulo1 + "\n\n";
        cadena += Mostrarmenu(menu);
        cadena += "Seleccione una opción";

        return Dialogo(cadena);
    }

    public static void main(String[] args) throws IOException {

        String[] opciones = {
            "Inicio",
            "Productos",
            "Punto de venta",
            "Inventario",
            "Listados de venta",
            "Salida"
        };

        String opcion;

        opcion = DesplegarMenu("===== MENU PRINCIPAL =====", opciones);

        System.out.println("\nElegiste: " + opcion);
    }
}