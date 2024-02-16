package Lec1;

public class PrintNumber {
	
	public static void main(String[] args) {
		int n=1;
		
		System.out.println(print(n));
		
		
	}

	private static int print(int n) {
		
		if(n==5) {
	
			return 5;
		}
		
		System.out.println(n);
		int bp=print(n+1);
		
		return bp;
	}

}
