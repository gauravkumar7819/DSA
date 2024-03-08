package Revision;


public class JumpGame {
public static void main(String[] args) {
    int arr[]={0,1};
  System.out.println( print(arr,1));
}

private static boolean print(int[] arr, int i) {
   
if (arr.length-1==i || arr.length-1==0) {
    boolean b=true;
   
  
   return b;
}


if (i>arr.length) {
   
    boolean b=false;
   
  
    return b;
    
}
if (arr[i]==0) {
   
    boolean b=false;
   
  
   return b;
}


   i=arr[i]+i;
  
 
    return print(arr, i);
}
    
}