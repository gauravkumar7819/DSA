 package Revision;

public class ClimbingStair {
    static int a=0;
public static void main(String[] args) {
    int n=4;
    print(n,"");
    System.out.println();
    System.out.println(a);

}

private static void print(int n, String ans) {
    if (n==0) {
        System.out.print(ans +" ");
        a++;

    }
    if (n<0) {
        return;
    }

    
    print(n-1, ans+"1");
    print(n-2, ans+"2");
    print(n-3, ans+"3");
    print(n-4, ans+"4");
    print(n-5, ans+"5");

}
}
    
