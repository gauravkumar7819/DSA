package Lec6;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();


}
int n1=sc.nextInt();
int idx=0;
System.out.println(print(arr,n1,idx));


    }

    public static int print(int arr[],int n1,int idx){


if(arr.length==idx)
{
    return -1;
}
if(arr[idx]==n1){

    return idx;
}

return print( arr,n1,idx+1);
    }
}
