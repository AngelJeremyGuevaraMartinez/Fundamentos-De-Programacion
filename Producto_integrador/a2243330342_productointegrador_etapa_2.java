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
    
    
    // se agrego esta nueva funcion donde se verifica si la cadena es nula o no y se regresa 
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        
        if (cadena != null) {
            cadena = cadena.trim();

            if (cadena.equals("")) {
                cadena = null;
            }
        }
        return cadena;
    }
    
    // en esta funcion se agrego para evaluar si un numero es entero o no y si encuentra un caracter o que no sea un digito retorna false
    public static boolean Esnumeroentero(String dato) {
        if (dato == null || dato.equals("")) {
            return false;
        }
        for (int i = 0; i < dato.length(); i++) {
            char c = dato.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean EsNumeroDouble(String dato) {
        boolean punto = false;
        if (dato == null || dato.equals("")) {
            return false;
        }
        for (int i = 0; i < dato.length(); i++) {
            char c = dato.charAt(i);
            if (Character.isDigit(c)) {
            } else if (c == '.') {
                if (!punto) {
                    punto = true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
    
    public static boolean EvaluarNumerico(String dato, int tipo) {

        boolean valido = false;

        if (tipo == 1) {
            if (Esnumeroentero(dato)) {
                valido = true;
            }

        } else if (tipo == 2) {
            if (EsNumeroDouble(dato)) {
                valido = true;
            }
        }

        return valido;
    }
    public static String RellenarEspacios(String dato, int tamano) {

        String cadena = dato;

        for (int i = cadena.length(); i < tamano; i++) {
            cadena += " ";
        }

        return cadena;
    }
    
    
    public static String IdTicketSiguiente(String idticket) {

        int num;
        String idticketnext = "";
        num = Integer.parseInt(idticket);
        num = num + 1;
        if (num < 10) {
            idticketnext = "00" + num;
        } else if (num < 100) {
            idticketnext = "0" + num;
        } else {
            idticketnext = "" + num;
        }

        return idticketnext;
    }
    
    
    

    public static void main(String[] args) throws IOException {


    }
}