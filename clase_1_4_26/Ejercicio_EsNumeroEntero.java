
public class Ejercicio_EsNumeroEntero {
    public static boolean esEntero(String dato) {
        if(dato.equals("")) return false;
        for(int i=0;i<dato.length();i++){
            char c = dato.charAt(i);
            if(c < '0' || c > '9') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esEntero("123"));
    }
}
