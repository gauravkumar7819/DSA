package Lec9;

import java.util.Scanner;

public class MappedString {
      public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);;

        print(sc.nextLine(),"");
        
      }
      public static void print(String s,String ans){
        if(s.length()==0){
            System.out.println(ans +" ");
            return;
        }
          
        print(s.substring(1),ans+(char)(s.charAt(0)+16));
        if(s.length()>=2){
        int k = Integer.parseInt(s.substring(0,2));
        if (k<=26) {
          
        
        char c =(char)(k+64);
        print(s.substring(2),ans+c);
    } 

      }
      }
}