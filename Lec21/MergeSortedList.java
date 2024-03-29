package Lec21;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            Node head1 = null, tail1 = null;
            for (int i = 0; i < n1; i++) {
                int data = sc.nextInt();
                Node node = new Node(data);
                if (head1 == null) {
                    head1 = tail1 = node;
                } else {
                    tail1.next = node;
                    tail1 = node;
                }
            }
            int n2 = sc.nextInt();
            Node head2 = null, tail2 = null;
            for (int i = 0; i < n2; i++) {
                int data = sc.nextInt();
                Node node = new Node(data);
                if (head2 == null) {
                    head2 = tail2 = node;
                } else {
                    tail2.next = node;
                    tail2 = node;
                }
            }

            Node merged = merge(head1, head2);
            printList(merged);
        }
    }

    static Node merge(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node mergedHead = null, mergedTail = null;
        if (head1.data <= head2.data) {
            mergedHead = mergedTail = head1;
            head1 = head1.next;
        } else {
            mergedHead = mergedTail = head2;
            head2 = head2.next;
        }

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                mergedTail.next = head1;
                mergedTail = head1;
                head1 = head1.next;
            } else {
                mergedTail.next = head2;
                mergedTail = head2;
                head2 = head2.next;
            }
        }

        if (head1 == null) {
            mergedTail.next = head2;
        } else {
            mergedTail.next = head1;
        }

        return mergedHead;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
