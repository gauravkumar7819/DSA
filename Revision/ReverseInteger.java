package Revision;

public class ReverseInteger {
    public static void main(String[] args) {
	int n=-12311113;
//    System.out.println(reverse( n));}
//    public static  int reverse(int n) {
//    	33
//    	String g="";
//    	
//    	if(n==0) {
//    		
//    		return 0;
//    	}
//    	else if(n<0) {
//		n=n/-1;
//	String s=""+n;
//	int [] arr=new int[s.length()];
//	int j=s.length()-1;
//	for (int i = 0; i<s.length(); i++) {
//		
//		arr[j]=Integer.parseInt(""+s.charAt(i));
//		j--;
//	}
//	int count=0;
//	for (int i = 0; i < arr.length; i++) {
//		
//		if(arr[i]>0) {
//			break;
//		}
//		else {
//			count++;
//		}
//		
//	}
//for (int i = 0+count; i < arr.length; i++) {
//	
//	 g=g+arr[i];
//	
//}
//g="-"+g;
//	return Integer.parseInt(g) ; 
//}
//else {
//	
//	String s=""+n;
//	int [] arr=new int[s.length()];
//	int j=s.length()-1;
//	for (int i = 0; i<s.length(); i++) {
//		
//		arr[j]=Integer.parseInt(""+s.charAt(i));
//		j--;
//	}
//	int count=0;
//	for (int i = 0; i < arr.length; i++) {
//		
//		if(arr[i]>0) {
//			break;
//		}
//		else {
//			count++;
//		}
//		
//	}
//	
//for (int i = 0+count; i < arr.length; i++) {
//	
//	 g=g+arr[i];
//	
//}
//
//}
//       
//		return Integer.parseInt(g);
	
	int k=print(n);
	System.out.println(k);
}

	private static int print(int n) {
		int p=0;
		int r=0;
		while(n>0) {
			
			r=n%10;
			p=p*10+r;
			n=n/10;
			
		}
		return p;
		
	}}

    
