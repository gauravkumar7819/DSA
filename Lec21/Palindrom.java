package Lec21;

import java.util.Scanner;


class Node{
    int data;
    Node next;

    Node(int data){

        this.data=data;
        next =null;
    }
}
public class Palindrom {
    public static Node mid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
          
    }
return slow;}
    
    
  
   static  int size;
    public static void display(Node head){
        Node temp=head;
                while (temp!=null) {
                   
                    
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int data=sc.nextInt();
    Node head=null;
    Node tail=null;
while (data!=-1) {
    Node n=new Node(data);
    if (head==null) {
        
        head=n;
        tail=n;
        head.next=null;
        size++;
    }
    else{

tail.next = n;
tail = n;
size++;
    }
 data=sc.nextInt();
    
}
System.out.println(size);


display(head);
System.out.println();
Node temp =mid(head);
reverse(temp,head);
System.out.println(temp.data);
display(head);

}
private static void reverse(Node temp, Node head) {
    Node prev=null;
    Node curr=head;
    while (curr.next!=temp) {
    
       Node  next=curr.next;
       curr.next=prev;
       prev=curr;
       curr=next;}
       curr.next=prev;
       System.out.println(curr.data+ " " +curr.next.data);
}





}
