package Revision;

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
                int count = countTwins(str, 0);
                        System.out.println(count);
                                scanner.close();
                                    }

    public static int countTwins(String str, int index) {
        if (index >= str.length() - 2) {
                    return 0;
                            }                
        int count = 0;
        if (str.charAt(index) == str.charAt(index + 2)) {
                    count = 1 + countTwins(str, index + 1);
                            }                                                                  
                                                                                       
        else {
            count = countTwins(str, index + 1);
                    }

        return count;
    }
}
