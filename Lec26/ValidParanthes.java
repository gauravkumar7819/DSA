package Lec26;


public class ValidParanthes {
    public static void main(String[] args) {
        String ss="([]){()}(){}(){}(())[](})({})";
        valid(ss);


   
        

    }

    private static void valid(String ss) {
   System.out.println(ss.replace("()","") );
    }
}
