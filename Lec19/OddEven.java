package Lec19;

import java.util.Scanner;

import Lec14.LinkedList;
class Node{
    int data;
    Node next;

    Node(int data){

        this.data=data;
        next =null;
    }
}
public class OddEven {
  
   static  int size;
    public static void display(Node head){
        Node temp=head;
                while (temp!=null) {
                    LinkedList ll=new LinkedList();
                    ll.addLast(temp.data);
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
oddeven(head);
   
}

private static void oddeven(Node head) {
    LinkedList ll=new LinkedList();
    Node temp=head;
   
    Node temp2=head.next;
while (temp!=null) {

    ll.addLast(temp.data);

if (temp.next==null) {
    break;
  
    
}

   temp=temp.next.next;
}
while (temp2!=null) {
    ll.addLast(temp2.data);

if (temp2.next==null) {
    break;
    
}
   temp2=temp2.next.next;
}
ll.display();


}

}
