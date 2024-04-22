package Lec27;

import java.util.Arrays;

public class Dailytemp {
   public static void main(String[] args) {
    int arr[]={30,40,50,60};
    int num[]=new int[arr.length];
    for (int i = 0; i < num.length; i++) {
        for (int j = i+1; j < num.length; j++) {
            if (arr[i]<arr[j]) {
                num[i]=j-i;
                break;

            }
        }
    }
    System.out.println(Arrays.toString(num));
   }


}
