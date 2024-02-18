package Revision;

import java.util.ArrayList;
import java.util.List;

public class LexoCount {
	public static void main(String[] args) {
		int n = 15;
		List<Integer> list=new ArrayList<>();
		print(n, 0,list);
System.out.println(list);
	}

	private static void print(int n, int ans, List<Integer> list) {
		
		if (ans <=n) {
			if (ans!=0) {
				
			
list.add(ans);}}
		if (ans > n)
			return;
		int i = 0;
		if (ans == 0) {
			
			i = 1;
		}
		for (; i <= 9; i++) {
			print(n, ans * 10 + i, list);
		}

	}
}
