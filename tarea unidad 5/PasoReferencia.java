public class PasoReferencia {
    public static void main(String[] args) {
        int[][] arr = {{2,0,3},{5,6,1},{8,2,9}};
        double altura = 1.75;
        int peso = 78;

        multiplica(arr,altura,peso,2);
    }

    static void multiplica(int[][] arr,double altura,int peso,int f){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]*=f;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        altura*=f;
        peso*=f;
        System.out.println("Altura: "+altura+" Peso: "+peso);
    }
}
