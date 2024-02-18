package Revision;

public class GeneratingParenthesis {
    static int a=0;
    public static void main(String[] args) {
        int n=2;
        print(n,0,0,"");
        System.out.println();
        System.out.println(a);
       
    }

    private static void print(int n, int opening, int closing, String ans) {
if (opening==n  && closing==n) {
    System.out.print(ans +" ");
    a++;
}
        
if (closing>n && opening>n) {
    return;
}
if(opening<n)
{
print(n, opening+1, closing, ans+"(");
}
if (closing<opening) {
    print(n, opening, closing+1, ans+")");
    
}
}
}
