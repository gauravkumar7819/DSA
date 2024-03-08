package DSA_Hackathon;

public class SubSequence {
    public static void main(String[] args) {
        String str="abc";
        print(str,"");
    }

    private static void print(String str, String ans) {
        
       
            if (str.length()==0) {
                System.out.println(ans);
                return;
                  }
  
  
print(str.substring(1), ans+str.charAt(0));
print(str.substring(1), ans);

    }
}
