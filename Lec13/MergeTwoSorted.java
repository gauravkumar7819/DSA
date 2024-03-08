package Lec13;

import java.util.Arrays;

public class MergeTwoSorted  {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8,9,10,8};
       int[]b= mergeArray(arr1,arr2);
       System.out.println(Arrays.toString(b));
} protected static int[] mergeArray(int[] arr1, int[] arr2) {
    int idx=6;
        int []ans=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while (arr1.length>i && arr2.length>j) {
            if (arr1[i]<idx) {
                
                ans[k++]=arr1[i++];
                
            }
            else{
                ans[k++]=arr2[j++];
            }
            
        
        }
        while (i<arr1.length) {
            ans[k++]=arr1[i++];
            
        }
        while (j<arr2.length) {
            ans[k++]=arr2[j++];
            
        }
       
        return ans;

    
    }
}