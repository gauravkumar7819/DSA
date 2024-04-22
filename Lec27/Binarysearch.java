import java.util.*;
//Next greater element
public class Binarysearch {
    public static int search(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        System.out.println("enter the value of key to search");
        int key = sc.nextInt();
        System.out.println("key value "+key+" is found at index"+" " +search(num, key));
    }
}