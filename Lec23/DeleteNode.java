package Lec23;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        int n = sc.nextInt();

        while (n-- > 0) {
            int data =sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
           
        }
        display(head);
        delete(head);

        // int k = sc.nextInt();

        // System.out.println();
        // System.out.println(result);
     
    }
    private static void delete(Node head) {
        Node temp=head;
        Node temp2=temp.next;

temp.next=temp2;
head=temp.next;
display(head);
       
    }
    public static void display(Node head) {
    
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
            
        }
        // System.out.println("null");
        
    }
}
