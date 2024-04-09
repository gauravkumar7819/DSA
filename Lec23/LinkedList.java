package Lec23;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;

    }
    
}

public class LinkedList {
    public static void main(String[] args) {
        int n=5;
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Node tail=null;
        while (n-->0) {
            int data=sc.nextInt();
            Node nn=new Node(data);
            if (head==null) {
             
                head=nn;
                tail=nn;
                head.next=null;
                
                
            }
            else{
                // Node nn=new Node(data);
                tail.next=nn;
                tail=nn;
                // tail.next=null;
        }
        }
        // display(head);
       reverse(head);
       display(head);

    }

    private static void reverse(Node head) {
        Node prev=null;
        Node curr=head;
        while (curr!=null) {
        
           Node  next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;}
           display(head);
        }

    private static void display(Node head) {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
      
    }

    
}