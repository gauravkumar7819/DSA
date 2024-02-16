package Revision;

public class LexicoString {
public static void main(String[] args) {
	
	String str="abc";
	
	print(str,"");
	
}

private static void print(String str, String ans) {

	if(str.length()==0) {
		
		System.out.println(ans);
	}
	if(str.length()<0) {
		
		return;
	}
	
	print(str.substring(0), ans+str.charAt(0));
	print(str.substring(0),ans);
}
}
