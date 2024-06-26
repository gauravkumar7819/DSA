package DSA_Hackathon;

public class Sudoku {
    public static void main(String[] args) {
        int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		display(grid);

        solve(grid,0,0);
        System.out.println("*****************************");
        display(grid);
    }

    
    

    private static boolean solve(int[][] grid, int row, int col) {
if (col==9) {
    col=0;
    row=row+1;

}
if (row==9) {
   return true; 
}
boolean flag=false;
if (grid[row][col]!=0) {
    flag=solve(grid, row, col+1);
}
else{
for (int i = 1; i <=9; i++) {
    if (check(grid,row,col,i)) {
        grid[row][col]=i;
        flag=solve(grid, row, col+1);
        if (flag==true) {
            return flag;
        }
        grid[row][col]=0;
    }
}

}

return flag;

    }




    private static boolean check(int[][] grid, int row, int col, int val) {

        // row
        int r=row;
        int c=col;
        for (int i = 0; i < grid.length; i++) {
           if (grid[i][c]==val) {
            return false;
           }
        }
        for (int i = 0; i < grid.length; i++) {
            if (grid[r][i]==val) {
             return false;
            }}
            r=row-row%3;
            c=col-col%3;
            for (int i = r; i <r+3 ; i++) {
                for (int j = c; j < c+3; j++) {
                    if (grid[i][j]==val) {
                        return false;
                        
                    }
                }
            }
         
        return true;
        
    }
    private static void display(int[][] grid) {
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid.length; j++) {
        System.out.print(grid[i][j]+" ");
    }
    System.out.println();
}

    }
}
package Lec9;

public class WordSearch {
    static boolean solve(char[][] board,int row, int col, int idx,String word){
        if(idx==word.length()){ 
            return true;
        }
        if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col]=='*' || board[row][col]!=word.charAt(idx)){
            return false;
        }        
        boolean flag = false;
        char ch = board[row][col];
        board[row][col]='*';
        int[] r ={0,1,0,-1};
        int[] c ={1,0,-1,0};
        for(int i = 0;i<4;i++){
            flag=solve(board, row+r[i], col+c[i], idx+1, word);
            if (flag) {
                return flag;
            }
        }
        board[row][col]=ch;
        return flag;
    }
    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};
        String word = "AB";
        boolean flag=false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]==word.charAt(0)){
                   flag= solve(board,i,j,0,word);
                   if (flag) {
                    System.out.println(true);
                    return;
                }
                  
                }
            }
        }
       
        System.out.println(false);
    }
    
}