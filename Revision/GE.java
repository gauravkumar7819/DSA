package Revision;

public class GE {
    public static void main(String[] args) {
        String s="cab";
        String str="";
        for (char i = 0; i < s.length(); i++) {
            char ch=(char) (97+i);
            str=str+ch;
           
        }
        System.out.println(str);
        
    }
}
