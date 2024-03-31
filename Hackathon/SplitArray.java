package Hackathon;
import java.util.*;
public class SplitArray {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ar[]=new int [n];
        for(int i=0;i<ar.length;i++)
        ar[i]=scn.nextInt();
        int t=print(ar,0,0,"",0,"");
        System.out.print(t);
    }
    public static int print(int ar[],int idx,int suml,String ansl,int sumr,String ansr)
    {
        if(ar.length==idx){
        if(suml==sumr)
        {
            System.out.println(ansl+" and "+ansr);
            return 1;
        
        }
            return 0 ;}
        int a=print(ar,idx+1,suml+ar[idx],ansl+ar[idx]+" ",sumr,ansr);
        int b=print(ar,idx+1,suml,ansl,sumr+ar[idx],ansr+ar[idx]+" ");
        return a+b;
    }
}