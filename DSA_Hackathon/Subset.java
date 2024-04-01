package DSA_Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            
         }
         int idx=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        List<List> ans=new ArrayList<>();
        print(arr,0,idx,list,ans);
         System.out.println(list);
    }

    private static void print(int[] arr, int lp,int idx, List<Integer> list, List<List> ans) {
       
        if (idx==0) {
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i)+" ");
}
System.out.print(" ");
            ans.add(new ArrayList<>(list)); 
        }
    

    for (int i = lp; i < arr.length; i++) {
list.add(arr[i]);
print(arr, i+1, idx-arr[i], list, ans);
        list.remove(list.size()-1);
    }
    }
}
