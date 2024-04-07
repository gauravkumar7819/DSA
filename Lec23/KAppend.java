package Lec23;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){

        this.data=data;
        next =null;
    }
}
public class KAppend {
  
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
    int val=sc.nextInt();
    
    Node head=null;
    Node tail=null;
for (int i = 0; i < val; i++) {
    
    int data=sc.nextInt();

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
    
}
int k=sc.nextInt();
System.out.println(size);


// display(head);
print(head,k,tail);
// display(head)
System.out.println();

   
}

private static void print(Node head,int k,Node tail) {
    Node temp=head;
Node temp2=head;
// k=k%size2;
for (int i = 0; i <=k; i++) {
    temp=temp.next;
    
}
       while (temp!=null) {
        temp=temp.next;
        temp2=temp2.next;
        
       } 
    
     tail.next=head;
     head=temp2.next;
     tail=temp2;
     temp2.next=null;
display(head);

      
    }
  

}


