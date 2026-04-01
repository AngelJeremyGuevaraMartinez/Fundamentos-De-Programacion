
public class Ejercicio_RellenarEspacios {
    public static String rellenar(String dato, int tam){
        String cadena = dato;
        while(cadena.length() < tam){
            cadena += " ";
        }
        return cadena;
    }

    public static void main(String[] args){
        System.out.println("'" + rellenar("Hola",10) + "'");
    }
}
