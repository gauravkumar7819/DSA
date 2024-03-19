package Lec13;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={8,7,6,5,4,3,2,1};
       int d[]= mergesort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(d));
    }
    private static int[] mergesort(int[] arr, int st, int ed) {

        if (st==ed) {
            int arr1[]=new int[1];
             arr1[0]=arr[st];
            return arr1;
        }
        int mid=(st+ed)/2;
       int []a= mergesort(arr, st, mid);
       int[]b= mergesort(arr, mid+1, ed);
int []c=mergeArray(a,b);
return c;
}  
protected static int[] mergeArray(int[] arr1, int[] arr2) {
    int []ans=new int[arr1.length+arr2.length];
    int i=0;
    int j=0;
    int k=0;
    while (arr1.length>i && arr2.length>j) {
        if (arr1[i]<arr2[j]) {
            
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
