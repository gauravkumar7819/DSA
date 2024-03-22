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

public class MergeSortedList {
    public  static void display(Node head) {
    
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
            
        }
        System.out.println("null");
        
    }
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

     display(head);
    }}