package DSA_Hackathon;

public class WordSearch {
    public static void main(String[] args) {
        char[][] arr ={{'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}};  
        String word = "ABCCFED";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]==word.charAt(i)) {
                   boolean flag= print(arr,i,j,0,word);
                   System.out.println(flag);
                }
            }
        }
    }

    private static boolean print(char[][] arr, int row, int col, int idx, String word) {
       
  if (word.length()==idx) {
    return true;
  }
  if(row < 0 || col < 0 || row == arr.length || col == arr[0].length || arr[row][col]=='*' || arr[row][col]!=word.charAt(idx)){
    return false;
}
        char ch=arr[row][col];

        int[]r={0,1,0,-1};
        int[]c={1,0,-1,0};
      
        boolean flag = false;
        arr[row][col]='*';
        for (int i = 0; i < c.length; i++) {
         
           flag= print(arr, row+r[i], col+c[i], idx+1, word);
           if (flag) {
            return flag;
           }
           arr[row][col]=ch;
        }
        return flag;
    }
}
