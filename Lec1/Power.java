package Lec1;

public class Power {
	public static void main(String[] args) {
		int a=35;
		int b=28;
		
		System.out.println(pow(a,b));
	}

	private static int pow(int a, int b) {
		
		if(b==0) {
			
			return 1;
			
		}
		int bp=pow(a,b-1);
		return a*bp;
	
		
	}

}
