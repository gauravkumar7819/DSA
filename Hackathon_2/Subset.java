package Hackathon_2;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        List<Integer> ans=new ArrayList<>();
        int arr[]={1,2,3};
        int idx=3;
        print(arr,idx,0,ans);
    }

    private static void print(int[] arr, int idx, int lp, List<Integer> ans) {
if (idx==0) {
    System.out.println(ans);
    
}
      for (int j = lp; j < arr.length; j++) {
        ans.add(arr[j]);

print(arr, idx-arr[j], j+1, ans);
ans.remove(ans.size()-1);
        
      }
    }
    
}
