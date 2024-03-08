package Revision;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
      int[] arr={0,1,2,2,3,0,4,2};
      int target=2;
      int count=0;
      int k=0;
int []arr1=new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    if (arr[i]!=target) {
arr[k]=arr[i];
count++;
k++;
        
    }
}
String[]ch=new String[arr.length];
for (int i = 0; i < arr.length; i++) {
    ch[i]=""+arr[i];
    
}
for (int i = count; i < ch.length; i++) {
ch[i]="_";
    
}
System.out.println(count);
System.out.println(Arrays.toString(ch));

    }}
