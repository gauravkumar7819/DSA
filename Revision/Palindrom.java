package Revision;

public class Palindrom {
public static void main(String[] args) {
	
	int n=101;
System.out.println(	isPalindrome(n));
	
	}


private static boolean isPalindrome( int n) {
	
	String s=""+n;
	StringBuilder s1 =new StringBuilder(s);
	StringBuilder s2=s1.reverse();
	String s3=s2.toString();
	if(s.equals(s3)) {
		return true;

	}
	else {return false;}
}}
