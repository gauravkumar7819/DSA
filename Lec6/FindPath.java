package Lec6;

public class FindPath {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
	System.out.println(	print(arr,0,0,""));

	}

	private static int print(int[][] arr, int row, int col, String ans) {
		
		if (row==arr.length-1 && col==arr[0].length-1) {
			System.out.println(ans);
			return 1;
		}
		int count=0;
		if (row<arr.length-1) {
		count+=	print(arr,row+1,col,ans+"V");
		}
		if (col<arr[0].length-1) {
			count+=print(arr,row,col+1,ans+"H");
			return count;
		}
		return count;
	}

}
