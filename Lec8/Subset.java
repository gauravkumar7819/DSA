package Lec8;

import java.util.ArrayList;
import java.util.List;

public class Subset {
public static void main(String[] args) {
	int []arr={1,2,2};
	List<Integer> list=new ArrayList<>();
	List<List<Integer>> ans=new ArrayList<>();
	print(arr,list,0,ans);
	System.out.println(ans);

	
}

private static void print(int[] arr, List<Integer> list, int lp, List<List<Integer>> ans) {
	ans.add(new ArrayList<>(list));

	if (lp>arr.length) {
		return;
	}

	for (int i = lp; i < arr.length; i++) {
		list.add(arr[i]);
		print(arr, list, i+1, ans);
		list.remove(list.size()-1);
	}
}
	
}