package Lec25;

public class K_beauty {
public static void main(String[] args) {
    String str="123";
    print(str,"",0);
}

private static void print(String str, String ans, int j) {
    if (ans.length()==2) {
        System.out.println(ans);
        
    }
    if (str.length()<=0) {
        return;
        
    }
    int i=j;
    for (i= 0; i < str.length(); i++) {
        
    
    print(str.substring(i+1), ans+str.charAt(i), i);
    }
}
    
}