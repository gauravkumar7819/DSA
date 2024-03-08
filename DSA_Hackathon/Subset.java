package DSA_Hackathon;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int idx=3;
        List<Integer> list=new ArrayList<>();
        List<List> ans=new ArrayList<>();
        print(arr,0,idx,list,ans);
        System.out.println(ans);
    }

    private static void print(int[] arr, int lp,int idx, List<Integer> list, List<List> ans) {
       
        if (idx==0) {
for (int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i)+" ");
}
System.out.print("  ");
            ans.add(new ArrayList<>(list)); 
        }
    

    for (int i = lp; i < arr.length; i++) {
list.add(arr[i]);
print(arr, i+1, idx-arr[i], list, ans);
        list.remove(list.size()-1);
    }
    }
}
