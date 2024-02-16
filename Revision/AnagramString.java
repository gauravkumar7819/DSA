package Revision;
import java.util.Arrays;

public class AnagramString {
public static void main(String[] args) {
	String s="cat";
	String p="cat";
	char ch[]=new char[s.length()];
	for (int i = 0; i < s.length(); i++) {
		ch[i]=s.charAt(i);}
	Arrays.sort(ch);
char ch1[]=new char[p.length()];
	for (int i = 0; i < p.length(); i++) {
		ch1[i]=p.charAt(i);
}Arrays.sort(ch1);
	boolean b=Arrays.equals(ch, ch1);
	System.out.println( b);
	
	
	
}
}
