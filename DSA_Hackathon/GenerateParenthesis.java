package DSA_Hackathon;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        print(n,0,0,"");
    }

    private static void print(int n, int row, int col, String ans) {
      if (row==n &&col==n) {
        System.out.println(ans);
 
      }
      if (row>n &&col>row ) {
        return;
      }
       if (row<n) {
        print(n, row+1, col, ans+"(");
        
       }
       if (col<row) {
        print(n, row, col+1, ans+")");
       }
    }
}
