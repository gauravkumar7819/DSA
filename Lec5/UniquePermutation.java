package Lec5;

import java.util.ArrayList;
import java.util.List;

public class UniquePermutation {
public static void main(String[] args) {
		List<String> list=new ArrayList<>();																																						
	String s="abc";
	fn(s,"",list);
	System.out.println(list);
}

private static void fn(String s, String ans,List<String> list) {
	if(s.length()==0) {
		
		if(list.contains(ans)) {
			
			
		}
		else {
			
			list.add( ans);
		}
		System.out.println(ans);
		return;
		
	}
	
	
	for (int i = 0; i < s.length(); i++) {
		fn(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i), list);
	}
}
}
