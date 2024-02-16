package Revision;

class Solution {

    public static void main(String[]  args){

        double x=5;
        int n=2;
System.out.println(myPow( x, n));

    }
    public static  double myPow(double x, int n) {
        
if(n==0) {
			
			return 1;
			
		}
		double bp=myPow(x,n-1);
		return x*bp;
    }
}