 package Revision;

public class Fibbonacci {

    public static void main(String[] args) {
        int n=5;
      System.out.println(  print(n));
        
    }

    private static int print(int n) {

        if(n<=0){

            return 1;
        }
     int a=   print(n-1);
     System.out.println(a);
    int b= print(n-2);
      
       return a+b;
    }
}