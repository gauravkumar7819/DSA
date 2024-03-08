package DSA_Hackathon;

public class LexoCount {
    public static void main(String[] args) {
        int n=16;
        print(n,0);
    }

    private static void print(int n, int ans) {
        if (n<ans) {
            return;
        }
     if (ans>-1) {
System.out.print(ans +" ");}
 int i=0;
       if (ans==0) {
        i=1;
       } 
     
     for (; i <= 9; i++) {
        print(n, ans*10+i);

     }
    }
}
