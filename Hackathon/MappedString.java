package Hackathon;


public class MappedString {
    public static void main(String[] args) {
        String s="1234";
        print(s,"");
    }

    private static void print(String s, String ans) {
        if(s.length()==0){
            String ans1=ans.toUpperCase();
            System.out.println(ans1 +" ");
            return;
        }
        print(s.substring(1), ans+(char)(s.charAt(0)+48));
        if (s.length()>=2) {
            int k = Integer.parseInt(s.substring(0,2));
            if(k<=26){
        char c =(char)(k+96);
            print(s.substring(2), ans+c);
            }

            
        }
    }
}
