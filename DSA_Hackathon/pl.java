package DSA_Hackathon;

public class pl {
    static int count=0;
    public static void main(String[] args) {
        System.out.println( countHi("hihi") );
    }

        static int countHi(String str) {
            if (str.length() < 2) {
                return 0;
            }
            if (str.substring(0, 2).equals("hi")) {
             count+=1+countHi(str.substring(2));
    }
        return count;}
    }
