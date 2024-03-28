package Lec14;



public class LinkedList {
    class Node{
        int data;
        Node next;
    
}
public int size;
 public Node head;
public Node tail;
public void addFirst(int val){
Node nn=new Node();
nn.data=val;
    if (size==0) {
     head=nn;
     tail=nn;
     nn.next=null;

    }
    else{

       nn.next= head;
       head=nn;
    }

    size++;
}
public void addLast(int val){


 if (size==0) {
    addFirst(val);

    }
    else{
        Node nn=new Node(); 
nn.data=val;
tail.next=nn;
tail=nn;

    }
size++;

}
public void addKth(int k,int val){
    Node nn=new Node();
nn.data=val;

Node kth =getNode(k);
Node temp=kth.next;
kth.next=nn;
nn.next=temp;
}
public Node getNode(int k) {
Node temp=head;
for (int i = 1; i <= k; i++) {
    temp=temp.next;
}
return temp;
}
public void reverseList(){
Node prev=null;
Node curr=head;
while (curr!=null) {

   Node  next=curr.next;
   curr.next=prev;
   prev=curr;
   curr=next;
   
    
}
head=prev;

}
public Node get(int val){
    Node temp=head;
    for (int i = 1; i < size; i++) {
        if (temp.data==val) {
            return temp;
            
        }
        temp=temp.next;
    }
    return temp;

}

public void removeKthdata(int val){
    Node temp=get(val);
    Node temp2=temp.next.next;

temp.next=temp2;
}
public  void display() {
    
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" --> ");
        temp=temp.next;
        
    }
    System.out.println("null");
    
}
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addFirst(20);
     
       ll.display();
       ll.reverseList();
       ll.display();
       ll.createCyle();
       ll.display();
       System.out.println(ll.isCyle());
    }
    public Lec16.ReverseLinkedList.Node mid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mid'");
    }
   
}

