package Lec27;

import java.util.*;
public class HistoGram {public static void main(String[] args) {
int [] arr ={2,4};
System.out.println(largestRectangleArea(arr));  
}
 public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
for(int i = 0; i <= n; i++){
            int currHeight = i == n ? 0 : arr[i];
while(!st.isEmpty() && currHeight < arr[st.peek()]){

    int top = st.pop();
    int width = st.isEmpty() ? i : i - st.peek() - 1; 
    int area = arr[top] * width; 
    maxArea = Math.max(area, maxArea);}
st.push(i);
        }
        return maxArea;

    }
}