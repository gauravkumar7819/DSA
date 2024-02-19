package Revision;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String str="";
        for (char i = 0; i < a.length(); i++) {
            char ch=(char) (97+i);
            str=str+ch;
           
        }
 
        
ArrayList<String> list=new ArrayList<>();
        print(str,"",list);
        // System.out.println(list);
      int b= list.indexOf(a);
        for (int i = 0; i < b; i++) {
            System.out.println(list.get(i));
            
        }
    }

    private static void print(String str, String ans, ArrayList<String> list) {
if (str.length()==0) {
//    System.out.println(ans);
   list.add(ans);
    return;
}

    for (int i = 0; i < str.length(); i++) {
        
        print(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i), list);
    }
    }
}
