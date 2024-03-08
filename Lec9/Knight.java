package Lec9;

public class Knight{
    static int count =0;
    public static void main(String[] args){
        int [][] arr = new int[3][3];
        print(arr, 0 , 0);
        System.out.println(count);

    }
    private static void print(int [][] arr, int row , int col){

        if (row >= arr.length || col >= arr[0].length) {
            return;
        }
        if (row == arr.length-1 && col == arr[0].length-1) {
            count++;
            return;
        }
        // for knight
        int []r = {2 , 1};
        int []c = {1 , 2};
        for(int i = 0;i<c.length;i++){
            print(arr, row + r[i], col + c[i]);
        }

        // for Rook
        if(row ==0 || row == arr.length-1 || col ==0 || col == arr[0].length-1){

            // for row
            for(int i = 1 ; i<arr.length; i++){
                print(arr , row+i , col);
            }
            // for col
            for(int i = 1 ; i<arr.length; i++){
                print(arr , row , col+i);
            }
        }

        // for bishop
        if (row == col || row + col == arr[0].length) {
            for (int i = 1; i < arr.length; i++) {
                print(arr, row+i, col+i);
            }
        }
}}