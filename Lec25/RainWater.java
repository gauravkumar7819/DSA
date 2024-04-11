package Lec25;

import java.util.Arrays;

public class RainWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        // int lmax=arr[0];
        left[0]=arr[0];
        // right[arr.length-1]=arr[arr.length-1];
        for (int i = 1; i < right.length; i++) {
            if (arr[i]>left[i-1]) {
            left[i]=arr[i];
                
            }
            else{
                left[i]=left[i-1];
            }
        }
        int n=arr.length;
        right[n-1]=arr[n-1];
        for (int i = n-2; i <=0; i--) {
            if (arr[i]>right[i+1]) {
                right[i]=arr[i];
                
            }
            else{
                right[i]=right[i+1];
            }
            
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

    }
}
