package Lec25;

public class K_beauty {
    static int count=0;
public static void main(String[] args) {
    String str="43000043";
    int n=Integer.parseInt(str);
    print(str,"",n);
    System.out.println(count);
}

private static void print(String str, String ans, int n) {
    if (ans.length()==3) {
        int m=Integer.parseInt(ans);
        // System.out.println(n%m);

    //    if (m!=0) {
    //     if (n%m==0) {
    //         count=count+1;
            
    //     }
    //    }
        System.out.println(ans);
        
    }
    if (str.length()<=0) {
        return;
        
    }
    // int i=j;
    
    for (int i= 1; i < str.length(); i++) {
        
    
    print(str.substring(i+1), ans+str.substring(i, i+1), n);
    }
}
    
}