package Revision;
import java.util.Arrays;

public class RotateArray {
        public static void main(String[] args) {
            int k=100;
	int arr[]= {1 ,2 ,3,4,5};
	k=k%5;
 System.out.println(Arrays.toString( rotateArr(arr, k)));
    }
    public static int[] rotateArr(int[] arr, int k) {
    if(arr.length==1) {
    	
    	return arr;
    }
        	int arr1[]=new int[arr.length];
	for (int j= 0; j < k; j++) {
		for (int i = 1; i < arr.length; i++) {
			arr1[0]=arr[arr.length-1];
			arr1[i]=arr[i-1];
		}

for (int i = 0; i < arr1.length; i++) {
	arr[i]=arr1[i];
	
}
	}
	return arr;
    }
}