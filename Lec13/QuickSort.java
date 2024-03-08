package Lec13;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={9,1,56,-9,56,5,2,68,5,62,3,2,90};
       
      Partisan(arr,0,arr.length-1);
      System.out.println(Arrays.toString(arr));
     
    }

    private static void Partisan(int[] arr, int lo, int hi) {

       int lastElement=arr[hi];
       int idx=lo;
       for (int i = lo; i < hi; i++) {
        if (arr[i]<=lastElement ){
            int t=arr[i];
            arr[i]=arr[idx];
            arr[idx]=t;
            idx++;
            
        }
      }
       
       int t=arr[idx];
       arr[idx]=arr[hi];
       arr[hi]=t;
      System.out.println(Arrays.toString(arr));

    
    }}