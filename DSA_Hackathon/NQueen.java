package DSA_Hackathon;


public class NQueen {
    public static void main(String[] args) {
        int[][]arr=new int[4][4];

        int tq=4;
        print(arr,tq,0);

    }

    private static void print(int[][] arr, int tq, int row) {
if (tq==0) {
    Display(arr);
}
if (row == arr.length) {
    return;
}
        
for (int col = 0; col < arr.length; col++) {
    if (check(arr,row,col)) {
        arr[row][col]=1;
        print(arr, tq-1, row+1);
        arr[row][col]=0;

        
    }
    
}
    }

    private static boolean check(int[][] arr, int row, int col) {

        int r=row;
        int c=col;
        // col
        while (r>=0) {
            if (arr[r][c]==1) {
                return false;
                
            }
            r--;
            
        }
         r=row;
         c=col;
        while (r>=0 && arr[0].length>c) {
if (arr[r][c]==1) {
    return false;
}
r--;
c++;

            
        }
        r=row;
        c=col;
        while (r>=0 &&c>=0) {
           if (arr[r][c]==1) {
            
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
