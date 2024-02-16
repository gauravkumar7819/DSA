package Revision;

import java.util.Arrays;
import java.util.Collections;

public class AddTwoNum {
private static final Integer ArrayUtils = null;
public static int []fn(int[] a,int[] b){
	
	int c = 0;
	int d = 0;
	String str="";
	String str1="";
	for (int i = 0; i < a.length; i++) {
			str=str+a[i];}
for (int i = 0; i < b.length; i++) {
		
	 str1=str1+b[i];}

d=Integer.parseInt(str1);
c=Integer.parseInt(str);
int f=c+d;
String ss=""+f;
StringBuilder stringBuilder = new StringBuilder(ss);


StringBuilder reversedString = stringBuilder.reverse();


String s = reversedString.toString();
int[] arr=new int[s.length()];
for (int i = 0; i < s.length(); i++) {
	arr[i]=Integer.parseInt(""+s.charAt(i));
	
}
Collections.reverse(Arrays.asList(arr));
	return arr;
}
public static void main(String[] args) {

		String g="123";
	
		String []p=new String[g.length()];
		for (int i = 0; i < g.length(); i++) {
			p [i]= ""+g.charAt(i);
		}
		System.out.println(Arrays.toString( fn(new int[] {0},new int[] {0})));}

}
