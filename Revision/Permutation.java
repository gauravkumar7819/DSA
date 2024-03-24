package Revision;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		String str="123";
		List<String> list=new ArrayList<>();
		
		fn(str,"",list);
		System.out.println(list);
	}

	private static void fn(String s, String ans, List<String> list) {
		if(s.length()==0) {
			list.add(ans);
			System.out.println(ans);
		
		
		
		}
		for (int j = 0; j < s.length(); j++) {
		fn(s.substring(0, j)+s.substring(1+j),ans+s.charAt(j),list);
	}}
}
