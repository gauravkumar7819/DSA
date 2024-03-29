package LinkedListRevision;

import java.util.Scanner;

class Node{
    int data;
    Node next;

Node(int data){
this.data=data;
next=null;}}
public class ReverseList {

    public static void display(Node head){

        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+  " ");
            temp=temp.next;
            
        }
    }
    public static void main(String[] args) {
        
        Node head=null;
        Node tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while (data!=-1) {

            Node nn=new Node(data);
            if (head==null) {
                
        
            head=nn;
            tail=nn;
            tail.next=null;
        }
        else{

            tail.next=nn;
            tail=nn;

        }
           data= sc.nextInt();
            
        }
        middle(head);
        display(head);

     

        
    }
    private static void middle(Node head) {
       Node slow=head;
       Node fast=head;
       while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
       

        
       }
       System.out.println(slow.data);


    }
}
