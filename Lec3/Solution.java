package Lec3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
 
public static void main(String[] args) {
	
	List<String> list=new ArrayList<>();
int n=3;
	list= generateParenthesis(n,0,0,"",list);
	System.out.println(list);
	
}
       private static List<String>  generateParenthesis(int n, int opening, int closing, String ans, List<String> list) {
if(opening==n && closing==n)
{
	
	list.add(ans);
	return list;
}

if(opening <n) {
	 generateParenthesis(n,opening+1,closing,ans+"(", list);
	
	
}
if(closing<opening)
{
	
	 generateParenthesis(n,opening,closing+1,ans+")", list);
}
return list;
} 
    
}