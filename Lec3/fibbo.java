package Lec3;

public class fibbo {
	
	

	
 public static void main(String[] args) {
		int n=5;
		
		System.out.println(fn(n));
}

private static int fn(int n) {
	
	
	if(n==0) {
		
		return 0;
	}
	
	if(n==1) {
		
		return 1;
	}
	int b=fn(n-1);
	
	int c =fn(n-2);
	return  b+c ;
	
}

}
