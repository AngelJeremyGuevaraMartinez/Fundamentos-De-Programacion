
public class Ejercicio_ObtenerUltimaPosicion {
    public static int obtener(String[][] matriz){
        int pos = -1;
        for(int i=0;i<matriz.length;i++){
            if(!matriz[i][0].equals("")){
                pos = i;
            }
        }
        return pos;
    }

    public static void main(String[] args){
        String[][] matriz = {
            {"A",""},
            {"B",""},
            {"",""},
            {"D",""},
            {"",""}
        };
        System.out.println(obtener(matriz));
    }
}
