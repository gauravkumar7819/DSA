package Revision;

public class ClimbingStairs {
public static void main(String[] args) {
	
	int  n=3;
	System.out.println(fn(n,""));
}

private static int fn(int n, String ans) {

	
	if(n==0) {
		
	System.out.println(ans);
		
		return 1;
		
		
	}
	if(n<1) {
		
		return 0;
	}
	
	
	int a=fn(n-1,ans+ 1);
	int b=fn(n-2,ans+ 2);
	int c=fn(n-3,ans+ 3);
	return a+b+c;

}
}
