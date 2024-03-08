package Lec11;

public class NQueens {
	static int a=0;
	public static void main(String[] args) {
		int[][] board = new int[4][4];
		int q = 4;
		print(board, q, 0);
		System.out.println();
		System.out.println(a);
	}

	private static void print(int[][] board, int tq, int row) {
		if (tq==0) {
			Display(board);
			a++;
			return;
		}
		if (row == board.length) {
			return;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (ispossible(board, row, col)) {
				board[row][col] = 1;
				print(board, tq-1, row + 1);
				board[row][col] = 0;
			}
		}

	}

	private static boolean ispossible(int[][] board, int row, int col) {

		// for col
		int r = row;
		int c = col;

		while (r >= 0) {
			if (board[r][col] == 1) {
				return false;
			}
			r--;
		}

		// for left dig.
		r = row;
		c = col;

		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == 1) {
				return false;
			}
			r--;
			c++;
		}

		// for right dig.
		r = row;
		c = col;

		while (r >= 0 && c >= 0) {
			if (board[r][c] == 1) {
				return false;
			}
			r--;
			c--;
		}

		return true;

	}

	private static void Display(int[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j]==1) {
					
				
				System.out.print("{"+(i+1)+ "-"+(j+1) +"}"+" ");
			}

		}
		}
		System.out.print("  ");

	}

}
