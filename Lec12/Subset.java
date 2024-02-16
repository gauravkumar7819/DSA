package Lec12;

import java.util.*;

public class Subset {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		List<List<Integer>> ans = new ArrayList<>();
		print(arr, 0, new ArrayList<Integer>(), ans);
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> a = ans.get(i) ;
            for (int j = 0; j < a.size(); j++) {
                System.out.print(a.get(j)+ " ");
            }
            System.out.println();
            System.out.println("***************************************************88");
           
        }
		System.out.println(ans);
	}

	private static void print(int[] arr, int lp, ArrayList<Integer> list, List<List<Integer>> ans) {

	// System.out.println(list);
		ans.add(new ArrayList<Integer>(list));

		for (int i = lp; i < arr.length; i++) {
			list.add(arr[i]);
			print(arr, i + 1, list, ans);
			list.remove(list.size() - 1);

		}

	}

}