
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio_Dialogo {
    public static String dialogo(String texto) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(texto + ": ");
        return br.readLine();
    }

    public static void main(String[] args) throws IOException {
        String respuesta = dialogo("Ingresa algo");
        System.out.println("Respuesta: " + respuesta);
    }
}
