package Lec4;

public class UniquePer2 {

	public static void main(String[] args) {
		String s="abc";
		fn(s,"");
	
		}
	
		private static void fn(String s, String ans   ) {
		
			
			if(s.length()==0) {
				System.out.println(ans);
				return;
				
			}
			
			for (int i = 0; i < s.length(); i++) {
				boolean b=false;
				for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					
					b=true;
					break;
				}
				
				
					
				}
				
				if(b==false) {
			fn(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i) );
				
			}}}
}
	

