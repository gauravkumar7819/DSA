package Revision;

public class pathFind {
	static int a=0;
public static void main(String[] args) {
	int[][] arr=new int[3][3];
		print(arr,0,0,"");
		System.out.println(a);

	}

	private static void print(int[][] arr, int row, int col, String ans) {
		
		if (row==arr.length-1 && col==arr[0].length-1) {
//			System.out.println(ans);
			a++;
			return ;
		}
		if(row<0 || row==arr.length || col<0 || col==arr[0].length || arr[row][col]==1) {
			
			return ;
		}
		arr[row][col]=1;
		int []r= {0,1,0,-1};
int []c= {1,0,-1,0};

for (int i = 0; i < 4; i++) {
	print(arr, row+r[i], col+c[i], ans);
}
arr[row][col]=0;
		
	
}
}
