package Lec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dic {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
         }
         int tgt=sc.nextInt();
         List<Integer> list=new ArrayList<>();
         print(arr,0,tgt,list);
         System.out.println(list);
    }

    private static void print(int[] arr,int lp ,int tgt, List<Integer> list) {
       
        if (tgt==0) {

            System.out.println(list);
            
        }

        for (int i = lp; i < arr.length; i++) {
            list.add(arr[i]);
            print(arr, i+1, tgt-arr[i], list);
                    list.remove(list.size()-1);
                }
}}
