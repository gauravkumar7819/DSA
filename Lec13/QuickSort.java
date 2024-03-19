package Lec13;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int []arr={2,4,3,8,9,5,-1,7,5};
       
 
  quickSort(arr,0,arr.length-1);
      System.out.println(Arrays.toString(arr));
    }
   

    private static void quickSort(int[] arr, int lo, int hi) {
      if (lo>hi) {
        return;
      }
     int pi=Partisan(arr,lo,hi);
     quickSort(arr, lo,pi-1);
     quickSort(arr, pi+1, hi);
    } 


    private static int Partisan(int[] arr, int lo, int hi) {
 
       int pivot=arr[hi];
       int idx=0;
       for (int i = 0; i < hi; i++) {
        if (arr[i]<=pivot ){
            int t=arr[i];
            arr[i]=arr[idx];
            arr[idx]=t;
            idx++;
            
        }
      }
       
       int t=arr[idx];
       arr[idx]=arr[hi];
       arr[hi]=t;
      // System.out.println(Arrays.toString(arr));
      return idx;

    
    }}