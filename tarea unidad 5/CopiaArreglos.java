public class CopiaArreglos {
    public static void main(String[] args) {
        char[] vocales = {'a','e','i','o','u'};
        char[] otro = new char[5];

        System.arraycopy(vocales,0,otro,0,5);
        otro[3]='Z';

        for(int i=0;i<vocales.length;i++){
            System.out.println("vocales["+i+"]="+vocales[i]+" otro["+i+"]="+otro[i]);
        }
    }
}
