package Lec6;

import java.util.Scanner;

public class NthTriangle {
    static int a=0;
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
print(n);
System.out.println(a);

    }
    private static void print(int n) {
        a=a+n;

        if (n<=0) {
            return;
        }
        print(n-1);
    }
}
