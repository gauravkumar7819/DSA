package Lec4;

public class StrPermu {
	
	public static void main(String[] args) {
//	String s="abc";
//	fn(s,"");
//
//	}
//
//	private static void fn(String s, String ans   ) {

//		
//		if(s.length()==0) {
//			System.out.println(ans);
//			return;
//			
//		}
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			
//		fn(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i) );
//			
//		}
//	}
//
//}
		
		String s="abc";
		fn(s,"");
	}

	private static void fn(String s, String ans) {
	if(s.length()==0) {
		
		
		System.out.println(ans);
		return;
	}
	
	
	for (int i = 0; i < s.length(); i++) {
		
		fn(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));
	
		
	}
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
