package Lec1;

public class Fact {
public static void main(String[] args) {
	int n=6;
	System.out.println(fact(n));
}

private static int fact(int n) {
	if(n==1 || n==0)
	{
		
		return 1;
	}
	
	int bp=fact(n-1);
	
	return bp*n;
	
}

}
