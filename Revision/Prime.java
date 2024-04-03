package Revision;


public class Prime {
    static int a=0;
public static void main(String[] args) {
    
    
    int n=2;
    
   for (int i = 2; i <n; i++) {
    if(prime(i)){
        a++;
    }
   }
   System.out.println(a);
}

private static boolean prime(int i) {
    int count =0;
 for (int j = 1; j < i; j++) {
    if(i%j==0){
count++;

    }
    
 }

if(count<2){
System.out.print(i+" ");
return true;

}
return false;
    
}}