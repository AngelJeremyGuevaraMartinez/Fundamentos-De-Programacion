public class ArrTridim {
    public static void main(String[] args) {
        int[][][] chocolates = {
            {{1,2},{3,4}},
            {{5,6},{7,8}}
        };

        for(int i=0;i<chocolates.length;i++){
            for(int j=0;j<chocolates[i].length;j++){
                for(int k=0;k<chocolates[i][j].length;k++){
                    System.out.println("["+i+"]["+j+"]["+k+"]="+chocolates[i][j][k]);
                }
            }
        }
    }
}
