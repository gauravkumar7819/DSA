package DSA_Hackathon;

public class Tower {
    public static void main(String[] args) {
        int n=3;
        print(n,'A','B','C');
    }

    private static void print(int n, char from, char to, char helper) {
       if (n==0) {
        return ;
       }
       print(n-1, from, to, helper);
       System.out.println("Moving ring " + n + " from " + to + " to " + from);  
       print(n-1,helper, from, to);
       }
}
