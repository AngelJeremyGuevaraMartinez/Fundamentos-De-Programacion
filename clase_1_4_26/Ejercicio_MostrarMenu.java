
public class Ejercicio_MostrarMenu {
    public static String mostrarMenu(String[] opciones) {
        String cadena = "";
        for(int i = 0; i < opciones.length; i++) {
            cadena += (i+1) + ". " + opciones[i] + "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        String[] menu = {"Opcion 1","Opcion 2","Opcion 3"};
        System.out.println(mostrarMenu(menu));
    }
}
