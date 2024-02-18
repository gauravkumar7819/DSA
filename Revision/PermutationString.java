package Revision;

import Lec1.printNumber1;

public class PermutationString {
    public static void main(String[] args) {
        String str="123";

        print(str,"");
    }

    private static void print(String str, String ans) {
if (str.length()==0) {
    System.out.println(ans);
    return;
}

    for (int i = 0; i < str.length(); i++) {
        
        print(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i));
    }
    }
}
