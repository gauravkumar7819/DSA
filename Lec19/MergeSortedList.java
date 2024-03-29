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

        Node head1 = null;
        Node tail1= null;
        Node head2 = null;
        Node tail2= null;

        int data = sc.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
            data = sc.nextInt();
        }

        int data1 = sc.nextInt();
        while (data1 != -1) {
            Node newNode = new Node(data1);
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
            data1 = sc.nextInt();
        }
Node temp=merge(head1,head2);
     display(head1);
     display(head2);
     display(temp);
    }
    private static Node merge(Node head1, Node head2) {
        if (head1 == null)
        return head2;
    if (head2 == null)
        return head1;
       Node merHead=null;
       Node mertail=null;
      
       if (head1.data<=head2.data) {
        merHead=head1;
        mertail=head1;
        head1=head1.next;
       }
       else{
        merHead=head2;
        mertail=head2;
        head2=head2.next;
       }
       while (head1!=null && head2!=null) {
        if (head1.data<=head2.data) {
            mertail.next=head1;
            mertail=head1;
            head1=head1.next;
            
        }
    else{
        mertail.next=head2;
        mertail=head2;
        head2=head2.next;  
    }
    
        
       }
       if (head1 == null) {
        mertail.next = head2;
    } else {
        mertail.next = head1;
    }
    return merHead;

    }}