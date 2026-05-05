import java.util.*;
public class Problema6_Permutaciones {
    static void permute(char[] arr, boolean[] used, StringBuilder sb){
        if(sb.length()==arr.length){
            System.out.println(sb);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]) continue;
            if(i>0 && arr[i]==arr[i-1] && !used[i-1]) continue;
            used[i]=true;
            sb.append(arr[i]);
            permute(arr,used,sb);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] arr=sc.next().toCharArray();
        Arrays.sort(arr);
        permute(arr,new boolean[arr.length],new StringBuilder());
    }
}