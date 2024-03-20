package Revision;


import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int []arr={-1,2};
        int target=3;
        int []arr1=new int[arr.length];
        int k=0;
        for (int i = arr.length-target; i < arr.length; i++) {
           arr1[k]=arr[i];
           k++;
        }
        for (int i = 0; i < arr.length-target; i++) {
            arr1[k]=arr[i];
            k++;
        }
        for (int i = 0; i < arr1.length; i++) {
           arr[i] =arr1[i];
        }
        System.out.println(Arrays.toString(arr));
    }
        
    }

