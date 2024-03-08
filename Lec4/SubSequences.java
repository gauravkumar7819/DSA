package Lec4;

public class SubSequences {

	public static void main(String[] args) {
	String s="abc";
	fn(s,"");

	}

	private static void fn(String s,String ans) {
	
		
		if(s.length()==0) {
			System.out.print(ans +" ");
			return;
			
		}
		
		
		fn(s.substring(1),ans+s.charAt(0));

		fn(s.substring(1),ans);
		int k=s.charAt(0);
		// ans+=s.charAt(0);
//		
//		
//		
//	}
//
//}
		
		
		
		
		
		
		
		
		
		
		
		
//		String s="babad";
//		
//		fn(s,"");}
//
//	private static void fn(String s, String ans) {
//	if(s.length()==0) {
//		  StringBuilder stringBuilder = new StringBuilder(ans);
//	                StringBuilder reversedString = stringBuilder.reverse();
//	        
//
//	        String ans1 = reversedString.toString();
//	        if(ans.equals(ans1) && ans.length()>1 ) {
//	    		System.out.println(ans);
//	
//	        }
//		
//		return ;
//	}
//	
//	fn(s.substring(1),ans+s.charAt(0));
//	fn(s.substring(1),ans);
//	
//	}
}
}