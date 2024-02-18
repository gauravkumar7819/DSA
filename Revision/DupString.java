package Revision;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DupString {
  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ans=scanner.next();
        Set<String> set=new HashSet<>();
        for (int i = 0; i < ans.length(); i++) {
            set.add(""+ans.charAt(i));
        }
        print(ans,"",set.size());
  
    }

   
    private static void print(String ans, String str, int j) {
        if (str.length()==j) {
            System.out.println(str);
            return;
            
        }
        if (ans.length()==0) {
            
            return;
        }
       
       for (int i = 0; i < str.length(); i++) {
        
      
if(ans.charAt(0)==str.charAt(i)){
 
    return;

}

}
        print(ans.substring(1), str+ans.charAt(0), j);
        print(ans.substring(1), str, j);
      
    }
}

