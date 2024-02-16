package Revision;

import java.util.Arrays;

class Solution_1{

    public static void main(String [] args){
System.out.println( Arrays.toString(findMedianSortedArrays(new int[]{1,2},new int[] {3,4})));

    }
    public static int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
int arr[] =new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
arr[i]=nums1[i];

        }
             for(int i=1;i<nums1.length+1;i++){
arr[i+nums1.length-1]=nums2[i-1];

        }  
int count=0;
        for(int i=1;i<arr.length;i++){
count =count+arr[i];


        } 
   return arr; }
}