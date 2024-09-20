package Lec28;

import java.util.Stack;

public class Validparenthesis {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        String str="(())";
        print(str,st);
        System.out.println(st+"ikjn");
    }

    private static void print(String str, Stack<Character> st) {
      for (int i = 0; i < str.length(); i++) {
        
      
        while (!st.isEmpty() && st.peek()=='(') {
            if (str.charAt(i)==')') {
                st.pop();
            }
        }
        st.push(str.charAt(i));
    }}
    

}
