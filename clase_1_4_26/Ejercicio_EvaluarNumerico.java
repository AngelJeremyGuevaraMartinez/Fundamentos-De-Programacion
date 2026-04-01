
public class Ejercicio_EvaluarNumerico {

    public static boolean esEntero(String dato) {
        if(dato.equals("")) return false;
        for(int i=0;i<dato.length();i++){
            char c = dato.charAt(i);
            if(c < '0' || c > '9') return false;
        }
        return true;
    }

    public static boolean esDecimal(String dato) {
        if(dato.equals("")) return false;
        boolean punto = false;
        for(int i=0;i<dato.length();i++){
            char c = dato.charAt(i);
            if(c >= '0' && c <= '9') continue;
            if(c == '.'){
                if(punto) return false;
                punto = true;
            } else return false;
        }
        return true;
    }

    public static boolean evaluar(String dato, int tipo){
        switch(tipo){
            case 1: return esEntero(dato);
            case 2: return esDecimal(dato);
            default: return false;
        }
    }

    public static void main(String[] args){
        System.out.println(evaluar("12.5",2));
    }
}
