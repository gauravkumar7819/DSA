package Revision;

import java.util.Arrays;

public class RemoveDuplicate {
public static void main(String[] args) {
    int[]arr={};
    int k=0;
if (arr.length==1) {
    System.out.print("[");

    for (int i = 0; i < 1; i++) {
        System.out.print(arr[i]);
    }
    System.out.print("]");

}
else if (arr.length==0) {
    System.out.print("[");

    for (int i = 0; i < 0; i++) {
        
    }
    System.out.print("]");
}else{
    int arr1[]=new int[arr.length];
    for (int i = 0; i < arr.length-2; i++) {
        if (arr[i]!=arr[i+2]) {
            arr[k]=arr[i];
            k++;
        }
    }
    arr[k]=arr[arr.length-2];
    k++;
    arr[k]=arr[arr.length-1];
    k++;
  
    System.out.println(k);
    System.out.print("[");
    int p=k-1;
    for (int i = 0; i < k; i++) {
        if (p==0) {
            System.out.print(arr[i]);
        }
    else{System.out.print(arr[i]+",");}
       p--;
    }
    System.out.print("]");}
  
}

    
}