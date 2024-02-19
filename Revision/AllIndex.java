package Revision;

import java.util.Scanner;

public class AllIndex {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []arr=new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
        
      }
      int target=sc.nextInt();
        int idx=0;
        print(arr,target,idx);

    }

    private static void print(int[] arr, int target, int idx) {
        if(idx>=arr.length){
            return;
           }
        if(target==arr[idx]){
System.out.print(idx+" ");

        }
       
       print(arr, target, idx+1);
    }
}
