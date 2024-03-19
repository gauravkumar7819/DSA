package Lec16;


import Lec14.LinkedList;

public class ReverseLinkedList {
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;

        }
    
}

public int size;
 public Node head;
public Node tail;
   public void reverseList(){
Node prev=null;
Node curr=head;
while (curr!=null) {

   Node  next=curr.next;
   curr.next=prev;
   prev=curr;
   curr=next;}
   
    
}
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.display();
        ll.reverseList();
        ll.display();
    }
}
