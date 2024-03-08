package Revision;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board ={{'A','B','C','E'},
                         {'S','F','C','S'},
                         {'A','D','E','E'}};  
                         String word = "ABCCED";
                   for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
if (board[i][j]==word.charAt(0)) {
print(board, j, j, 0, word);
    
}                    }
                   } 
     
      }

    private static boolean print(char[][] board, int row, int col, int idx, String word) {
     

        if (idx==word.length()) {
            return true;
            
        }
        if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col]=='*' || board[row][col]!=word.charAt(idx)){
            return false;
        }
        int r[]={0,1,0,-1};
        int c[]={1,0,-1,0};
        char ch=board[row][col];
        board[row][col]='*';
        boolean flag = false;
        for (int i = 0; i < c.length; i++) {
            flag=print(board, row+r[i], col+c[i], idx+1, word);
            if (flag==true) {
                return flag;
            }
            board[row][col]=ch;

        }
        return flag;
      
    }
}
