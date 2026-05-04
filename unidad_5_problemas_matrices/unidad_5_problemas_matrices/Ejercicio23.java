public class Ejercicio23 {
    public static void main(String[] args) {

        char[] arreglo = {'1','5','3','8','6','2'};

        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            cadena += arreglo[i];
        }

        int numero = Integer.parseInt(cadena);

        System.out.println("Cadena: " + cadena);
        System.out.println("Resultado x2: " + (numero * 2));
    }
}