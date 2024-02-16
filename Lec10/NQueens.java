package Lec10;


public class NQueens {
public static void main(String[] args) {
	int n=4;
	int [][] Board=new int[n][n];
	
	print(Board,n,0);
}

private static void print(int[][] board, int tq, int row) {
	
	if(tq==0) {
		
		Display(board);
		return;
	}
	if (row==board.length) {
		return;
		
	}
	for (int i = 0; i < board[0].length; i++) {
		if (ispossible()) {
			board[row][i]=1;
			print(board,tq-1,row+1);
			board[row][i]=0;
		}
		
	}
}

private static void Display(int[][] board) {
	
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board.length; j++) {
			
		}
	}
}

private static boolean ispossible() {

	return false;
}
}
