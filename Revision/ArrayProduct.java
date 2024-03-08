package Revision;


import java.util.Arrays;

public class ArrayProduct {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
       int pro=1;
       int[] arr1=new int[arr.length];
       int k=0;
     
        for (int i =0 ; i < arr.length; i++) {
            pro=1;
            for (int j = 0; j < arr.length; j++) {
                 if (i!=j) {
                    pro=pro*arr[j]; 
                   
                 }
                
            }
        arr1[k]=pro;
        k++;
           
        }
        System.out.println(Arrays.toString(arr1));
    }
}
