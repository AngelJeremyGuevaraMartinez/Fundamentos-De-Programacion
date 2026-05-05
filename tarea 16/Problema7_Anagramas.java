import java.util.*;
public class Problema7_Anagramas {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String, List<String>> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        for(List<String> group: map.values()){
            Collections.sort(group);
            for(String s: group) System.out.print(s+" ");
            System.out.println();
        }
    }
}