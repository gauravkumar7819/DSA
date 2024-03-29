package Lec19;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class FindKth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        int data = sc.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }

        int k = sc.nextInt();
        int result = findKthFromLast(head, k);
        System.out.println(result);
    }

    public static int findKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
  
        for (int i = 1; i < k; i++) {
            fast=fast.next;

            
        }
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
            
        }
return slow.data;
        
    }
}
