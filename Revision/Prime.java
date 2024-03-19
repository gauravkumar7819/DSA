package Revision;


public class Prime {
public static void main(String[] args) {
    
    int n=50;
   for (int i = 2; i < n; i++) {
    prime(i);
   }
}

private static void prime(int i) {
    int count =0;
 for (int j = 1; j < i; j++) {
    if(i%j==0){
count++;

    }
    
 }

if(count<2){
System.out.print(i+" ");

}
    
}}