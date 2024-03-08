package Revision;

import java.util.Arrays;

public class RemoveDuplicat {
public static void main(String[] args) {
    int []arr={3,2,3,4};
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length-1; j++) {
            
       
        if (arr[i]>arr[j+1]) {
          int k=  arr[i];
          arr[i]=arr[j+1];
          arr[j+1]=k;

            
        }}
    }
    int p=0;
int arr1[]=new int[arr.length];
    for (int i = 0; i < arr.length-1; i++) {
        if (arr[i]!=arr[i+1]) {
            arr1[p]=arr[i];
            p++;
        }
      
        
    }
 arr1[p]=arr[arr.length-1];
    System.out.println(Arrays.toString(arr1));
}
    
}