// package Lec29;

import java.util.Stack;

public class Stockspan {
    static int count =0;
public static void main(String[] args) {
    String str="()(()()())()((()))";
    Stack<Character> st=new Stack<>();
    st.push(str.charAt(0));
    for (int i = 1; i < str.length(); i++) {
        if(!st.isEmpty()) {
            
        
        if(st.peek()=='(' && str.charAt(i)==')'){
            st.pop();
            count++;
        }
        
        else   st.push(str.charAt(i));
    }
        else   st.push(str.charAt(i));

    

   
    }
    System.out.println(count);
}
    
}