package Revision;

public class CoinTo {
    static int a=0;
    public static void main(String[] args) {
        int n=3;
        print(n,"");
        System.out.println(a);
    }

    private static void print(int n, String ans) {
        if(n==0){
System.out.println(ans);
a++;

        }

        if (n<0) {
            return;
            
        }
        print(n-1, ans+"H");
        print(n-1, ans+"T");
    }
}
