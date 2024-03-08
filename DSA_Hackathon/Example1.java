package DSA_Hackathon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(countHi(str));
        System.out.println(removeHi(str));
        System.out.println(replaceHiWithBye(str));
    }

    // Recursive function to count the number of times 'hi' appears in the string
    static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2));
        }
        return countHi(str.substring(1));
    }

    // Recursive function to remove all occurrences of 'hi' in the string
    static String removeHi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("hi")) {
            return removeHi(str.substring(2));
        }
        return str.charAt(0) + removeHi(str.substring(1));
    }

    // Recursive function to replace all occurrences of 'hi' with 'bye' in the string
    static String replaceHiWithBye(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("hi")) {
            return "bye" + replaceHiWithBye(str.substring(2));
        }
        return str.charAt(0) + replaceHiWithBye(str.substring(1));
    }
}
