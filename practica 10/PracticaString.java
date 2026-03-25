import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PracticaString {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingresa una cadena: ");
        String texto = br.readLine();

        System.out.println(" Métodos de String ---");
        System.out.println("Longitud: " + texto.length());
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());
        System.out.println("Primer carácter: " + texto.charAt(0));
        System.out.println("Último carácter: " + texto.charAt(texto.length() - 1));

        // Contadores
        int letras = 0, numeros = 0, espacios = 0, otros = 0;

        // Métodos de Character
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else if (Character.isWhitespace(c)) {
                espacios++;
            } else {
                otros++;
            }
        }

        System.out.println("\n--- Conteo ---");
        System.out.println("Letras: " + letras);
        System.out.println("Números: " + numeros);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros caracteres: " + otros);

        // Extra (más métodos)
        System.out.println("\n--- Extras ---");
        System.out.println("Contiene 'a': " + texto.contains("a"));
        System.out.println("Reemplazar espacios por '_': " + texto.replace(" ", "_"));
    }
}