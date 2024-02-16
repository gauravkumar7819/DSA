package Revision;

public class LexicoGraphNum {
public static void main(String[] args) {
	
	int n=16;
	print(n,0);
}

private static void print(int n, int ans) {
	
	if( n<ans) {
		
		return;
	}
	if(ans>0) {

		System.out.println(ans);
	}
	int i=0;
	if(i==0) {
		
		i=0;
	}
	for (i = 1; i < 10; i++) {
		print(n,ans*10+i);
	}
}
}
