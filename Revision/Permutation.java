package Revision;

public class Permutation {
	public static void main(String[] args) {
		String str="123";
		
		fn(str,"");
	}

	private static void fn(String s, String ans) {
		if(s.length()==0) {
			
			System.out.println(ans);
		
		
		
		}
		for (int j = 0; j < s.length(); j++) {
			
		
		fn(s.substring(0, j)+s.substring(1+j),ans+s.charAt(j));
	}}
}
