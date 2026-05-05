import java.util.*;
public class Problema9_Frecuencia {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] freq=new int[26];
        for(char c: s.toCharArray()){
            if(c>='a'&&c<='z') freq[c-'a']++;
        }
        int max=0; char res='a';
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                res=(char)(i+'a');
            }
        }
        System.out.println(res+" "+max);
    }
}