package Lec17;

public class IsCyleList {
    class Node{
        int data;
        Node next;
    
}
public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
                    return false;
                    
            }
        }
    }
    return true;
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
public boolean isCyle(){
    Node slow = head;
                Node fast = head;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    if (slow == fast) {
                        System.out.println(fast.data);
                        return true;
                    }
                }
                return false;
    
    }
public void checkCyle(){
    Node slow = head;
                Node fast = head;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    if (slow == fast) {
                        System.out.println(fast.data);
                        fast.next=null;
                       
                    }
                }
               
    
    }
    public void createCyle(){
        tail.next=head.next;
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
        IsCyleList ll=new IsCyleList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.display();
        ll.createCyle();
        System.out.println(ll.isCyle());
        ll.checkCyle();
System.out.println(ll.isCyle());
ll.display();
ll.createCyle();

    }
}
