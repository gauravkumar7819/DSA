package Lec16;

import java.util.Scanner;
class Node{
    Node next;
    int data;
    Node(int data) {
     this.data=data;
     next=null;
    }
 
 }
public class LinkedList {

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    Node head=null;
    Node tail=null;
    int data=sc.nextInt();
    while (data!=-1) {
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
            tail.next=nn;
            tail=nn;
        }
        data=sc.nextInt();

        
    }
    display(head);
    addkth(head,2,6);
    display(head);
    // reverseList(head);
    addfirst(head,7);
    display(head);
}
private static void addfirst(Node head,int sev) {
    Node temp=head;
    Node nn=new Node(sev);
    head=nn;
    head.next=temp;


}
private static void reverseList(Node head) {
Node curr=head;
Node prev=head.next;

}
private static void addkth(Node head, int i, int j) {
   Node temp= head;
   for (int k = 1; k < i; k++) {
    temp=temp.next;
    
   }
   Node p=temp.next;
   Node nn=new Node(j);
   temp.next=nn;
   nn.next=p;


}
public static void display(Node head){
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("null");
}
    
}