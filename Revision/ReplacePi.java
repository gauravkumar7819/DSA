package Revision;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String[]arr=new String[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.next();
        
      }
      for (int i = 0; i < arr.length; i++) {
        
        System.out.println(arr[i].replace("pi","3.14"));
      }

  
    }
}
