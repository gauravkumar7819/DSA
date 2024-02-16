package Lec3;

public class Waytofind {
	static int a=0;
	public static void main(String[] args) {
		int n=4 ;

		
				
				
			System.out.println(print(n,""));
	
			System.out.println(a);
			}

			private static int  print(int n,String ans) {
				
				if(n==0) {
					System.out.println(ans);
					a++;
					return 1;
					
				}
				
				if(n<0) {
					
					return 0;
				}
		int a=print(n-1,ans+ 1);
		int b=print(n-2,ans+ 2);
		int c=print(n-3,ans+ 3);
		return a+b+c;
	
		
	
	
	
	
	
	
	
			}}
	
	
//	private static int  print(int n, String ans) {
//		if(n<1) {
//			
//			return 0;
//		}
//		
//		
//		if(n==0) {
//	System.out.println(ans);	
//	return 1;
//		}
//		int a=print(n-1,ans+ 1);
//		int b=print(n-2,ans+ 2);
//		int c=print(n-3,ans+ 3);
//		return a+b+c;
//		
//
//}}
