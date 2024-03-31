package Lec6;

public class LexicoGra {
public static void main(String[] args) {
	
//	int n=16;
//	for (int i = 1; i <= 9; i++) {
//	print(n,i);
//	}
//}

//private static void print(int n, int ans) {
//	
//	
//	
//	if (ans>n) {
//		return;
//	}
//	System.out.println(ans);
//	for (int i = 0; i <=9; i++) {
//		print(n,ans*10+i);
//	}
//	int n=16;
//	for (int i = 1; i <= 9; i++) {
//	print(n,i);
//	}
//}
	int n=16;

	print(n,1);
	
}
private static void print(int n, int ans) {
	
	
	
	if (ans>n) {
		return;
	}
	if(ans>0) {
		
	
	System.out.println(ans);}
 int i=0;
	 if (i==0) {
 	i=0;
		
	 }
	for ( ; i <=9; i++) {
		print(n,ans*10+i);
	}

}
}
