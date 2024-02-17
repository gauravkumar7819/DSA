package Revision;

import java.util.ArrayList;

public class LexicoString {
	public static void main(String[] args) {
		String str="abcd";
		ArrayList<String> list=new ArrayList<>();
		
		fn(str,"",list);
		for (int i = str.length()  ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void fn(String s, String ans, ArrayList<String> list) {
		if(s.length()==0) {
			list.add(ans);
			
		
		
		
		}
		for (int j = 0; j < s.length(); j++) {
			
		
		fn(s.substring(0, j)+s.substring(1+j),ans+s.charAt(j), list);
	}}
}
