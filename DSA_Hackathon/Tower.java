package DSA_Hackathon;

import java.util.*;
public class Tower {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        toh( n , "A","B","C");
    }
    public static void toh(int n, String s1,String s2,String s3){
        if(n==0)
        return ;
        toh(n-1,s1,s3,s2);
        System.out.println("Moving ring "+n+" from "+s1+" to "+ s2);
        toh(n-1,s3,s2,s1);
    }
}