package Lec15;



public class LinkedList {
    class Node{
        int data;
        Node next;
    
}
int size;
 Node head;
Node tail;
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
private Node getNode(int k) {
Node temp=head;
for (int i = 1; i <= k; i++) {
    temp=temp.next;
}
return temp;
}
public int  getFirst(){
    Node temp=head;
 return temp.data;
        
    }
    public int  getLast(){
        Node temp=tail;
     return temp.data;
            
        }

        public int getKthdata(int k){
            Node temp=head;

for (int i = 1; i < k; i++) {
    temp=temp.next;
}
return temp.data;

        }

        public void removeFirst(){
Node nn=new Node();

Node temp=head;
head=temp.next;
temp.next=nn;
temp=null;




        }
        public void removeLast(){
Node nn=new Node();
Node temp=getNode(size-2);
tail=temp.next;
temp.next=nn;
temp.next=null;

        }
        public void  removeKth(int k){

Node temp =getNode(k-2);
Node temp2=temp.next.next;

temp.next=temp2;




        }

public  void display() {
    
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" -> ");
        temp=temp.next;
        
    }
    System.out.println("null");
    
}
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
      ll.addLast(10);
      ll.addLast(30);
      ll.addLast(40);
      ll.addLast(10);
 
      ll.display();
      ll.addKth(3, 57);
       ll.display();
       System.out.println(ll.getLast());
       System.out.println(ll.getFirst());
       System.out.println(ll.getKthdata(5));
       ll.removeFirst();
       ll.display();
       ll.removeLast();
       ll.display();
       ll.removeKth(3);
       ll.display();
       


    }
}