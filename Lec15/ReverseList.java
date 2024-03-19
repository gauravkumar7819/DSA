package Lec15;

public class ReverseList {
class Node{

    int data;
    Node next;

}
Node head;
Node tail;
int size;
public void addLast(int val)
    {

        Node nn=new Node();
     
        if (size==0) {
            nn.data=val;
            head=nn;
            tail=nn;
            tail.next=null;
        }
        else{

            nn.data=val;
            Node temp=tail;
            tail.next=temp;
            tail=nn;
            tail.next=null;
        }
        size++;

    }
    public void reverseList()
    {


    }
    public void display()
    {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.display();
    }
}