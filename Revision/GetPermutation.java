package Revision;

import java.util.ArrayList;

public class GetPermutation {
public static void main(String[] args) {
	int target=9;
	int n=4;
	 String s="";
	 
     for(int i=1;i<=n;i++){
s=s+i;

     }
     ArrayList<String> list=new ArrayList<>();
    print(s,"",list);
 
   System.out.println(list.get(target-1));
}

private static void print(String s, String ans, ArrayList<String> list) {
		if(s.length()==0) {
			
		list.add(ans);
		
		
		
		}
		for (int j = 0; j < s.length(); j++) {
			
		
		print(s.substring(0, j)+s.substring(1+j),ans+s.charAt(j), list);
	}
}}
