package Lec7;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String[] args) {
		
		int target=7;
		int[] arr= {2,3,6,7};

	List<Integer> list=new ArrayList<>();
	List<List> ans=new ArrayList<>();		

	print(arr,target,list,ans);
	System.out.println(ans);
	
	}

	private static void print(int[] arr, int target, List<Integer> list, List<List> ans) {
		
		if(target==0) {
System.out.println(list);
			
		ans.add(new ArrayList<Integer>(list));
		}

		if(target<0) {
			
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			list.add(arr[i]);
			print(arr,target-arr[i],list, ans);
			list.remove(list.size()-1);
			
		}
	}

}
