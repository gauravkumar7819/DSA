package DSA_Hackathon;

public class Nknight {
   public static void main(String[] args) {
    int [][]arr=new int[3][3];
    int tq=3;
    print(arr,0,tq);
    
   }

private static void print(int[][] arr, int row, int tq) {

    
    for ( int col = 0; col < arr.length; col++) {
        if (check(arr,row,col)) {
            arr[row][col]=1;

        }
    }

}

private static boolean check(int[][] arr, int col, int row) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'check'");
} 
}
