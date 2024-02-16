package Revision;

public class Main_class {
	
	
public static void main(String[] args) {
	double a=2;
	long b=5;
	System.out.println(fn(a,b));
}

private static double fn(double a, long b) {
	
	
	
	if(b==0) {
		return 1;
	}
double res=fn(a,b/2);
	if(b%2==1) {
		
		return res*res*a;
	}
	else { return res*res;
	}}

	
	
}

