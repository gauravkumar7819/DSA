package Hackathon;

import java.util.ArrayList;
import java.util.List;

public class StringPerMu {
    
    public static void main(String[] args) {
        String str="123";
        List<String> list=new ArrayList<>();
        print(str,"",list);
    int idx=list.indexOf("321");
    int size=list.size()-1;
    int p=idx%size;
    System.out.println(size);
        System.out.println(list.get(p));
    }

    private static void print(String str, String ans, List<String> list) {
        if (str.length()==0) {
            System.out.println(ans);
            System.out.println();
            list.add(ans);
            
        }
        for (int i = 0; i < str.length(); i++) {
            
        
     print(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i), list);}
    }
}
