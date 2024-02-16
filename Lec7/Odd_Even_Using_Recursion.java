package Lec7;

public class Odd_Even_Using_Recursion {
public static void main(String[] args) {
	int n=5;
	print(n);
}

private static void print(int n) {
	if(n%2==1)
	{
		
		System.out.println(n);
		
	}
	if(n>1) {
		
		System.out.println(n);
	}
	if(n<0) {
		return;
	}

	print(n-1);
	n++;
	
	
}

}
