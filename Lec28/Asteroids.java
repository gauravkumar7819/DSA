package Lec28;

import java.util.Stack;

public class Asteroids {
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
       int arr[]={5,10,-5}  ;

       for (int i = 0; i < arr.length; i++) {
if (arr[i]<0) {
    while (!st.isEmpty() && st.peek()<-1*arr[i]) {
        st.pop();
        
    }
    if (!st.isEmpty() && st.peek() == -1*arr[i]) {
        st.pop();}
        else if (!st.isEmpty() && st.peek()> -1*arr[i]) {
continue;

}
else{
    st.push(arr[i]);}
}
else{
    st.push(arr[i]);

}

       }
       System.out.println(st);
    }
}
