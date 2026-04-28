public class ReferenciasArreglos {
    public static void main(String[] args) {
        char[] vocales={'a','e','i','o','u'};
        char[] otro=vocales;

        otro[0]='A';

        for(char c:vocales)
            System.out.print(c+" ");
    }
}
