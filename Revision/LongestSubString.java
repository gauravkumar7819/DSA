package Revision;

import java.util.Arrays;
import java.util.Iterator;

public class LongestSubString{
	public static void main(String[] args) {
		
		String s="pwwkew";
		char []  arr=new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i]=s.charAt(i);
			
		}

	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				
				for (int k = j; k < arr.length-1; k++) {
					
					arr[k]=arr[k+1];
					
				}
				arr=Arrays.copyOf(arr, arr.length-1);
				j--;
			}
			
		}
		
	}
	System.out.println(Arrays.toString(arr));
	}
	
}