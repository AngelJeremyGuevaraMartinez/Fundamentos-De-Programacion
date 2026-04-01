
public class Ejercicio_EsNumeroDouble {
    public static boolean esDecimal(String dato) {
        if(dato.equals("")) return false;
        boolean punto = false;

        for(int i=0;i<dato.length();i++){
            char c = dato.charAt(i);

            if(c >= '0' && c <= '9') continue;

            if(c == '.'){
                if(punto) return false;
                punto = true;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esDecimal("12.5"));
    }
}
