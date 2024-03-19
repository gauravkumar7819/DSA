package Lec16;

import Lec14.LinkedList;

public class DeleteNode {
    class Node{
        int data;
        Node next;
    
}
int size;
 Node head;
Node tail;
  
                  
                    
 public static void main(String[] args) {
                        
    LinkedList ll=new LinkedList();
    ll.addFirst(19);
    ll.addFirst(9);
    ll.addFirst(1);
    ll.addFirst(9);
    ll.addFirst(8);
    ll.display();
    ll.reverseList();
    ll.display();
    ll.removeKthdata(9);
    ll.display();
   

                
    
                    }

}
