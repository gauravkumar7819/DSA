package Lec9;

public class MappedString {
      public static void main(String[] args) {
        String s="1125";
        print(s,"");
        
      }
      public static void print(String s,String ans){
        if(s.length()==0){
            System.out.print(ans +" ");
            return;
        }
          
        print(s.substring(1),ans+(char)(s.charAt(0)+48));
        if(s.length()>=2){
        int k = Integer.parseInt(s.substring(0,2));
        char c =(char)(k+96);
        print(s.substring(2),ans+c);
    } 

      }
    
}