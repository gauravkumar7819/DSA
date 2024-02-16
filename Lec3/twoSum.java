package Lec3;

import java.util.Arrays;

public class twoSum {
public static void main(String[] args) 
{
	
	int [] n= {1,2,3,4};
	int target=4;
	
	System.out.println(Arrays.toString(fn(n,target)));
}

private static int[] fn(int[] n, int target) {
	
	for (int i = 0; i < n.length; i++) {
		
		
		for (int j = i+1; j < n.length; j++) {
			
			if(n[i]+n[j]==target) {
				int []inp= {i,j};
				return inp;
			}
			
			
			
			
		}
	}
	return n;
}
}
