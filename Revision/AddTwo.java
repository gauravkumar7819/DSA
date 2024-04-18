import java.util.Scanner;

/**
 * InnerAddTwo
 */
 class Node {
int data;
Node next=null;
Node(int data){
    this.data=data;
    next=null;


}
    
}
public class AddTwo {
public static void main(String[] args) {
    Node h1=null;
    Node h2=null;
    Node t1=null;
    Node t2=null;
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    while (n1-->0) {
        int data=sc.nextInt();
        Node nn=new Node(data);
        if (h1==null) {
            h1=nn;
            t1=nn;
            t1.next=null;

            
        }
        else{
            t1.next=nn;
            t1=nn;
        }
        
    }
    int m=sc.nextInt();
    while (m-->0) {
        int data=sc.nextInt();
        Node n=new Node(data);
        if (h2==null) {
            h2=n;
            t2=n;
            t2.next=null;

            
        }
        else{
            t2.next=n;
            t2=n;
        }
        
    }

    add(h1,h2);
}

private static void add(Node h1, Node h2) {

    Node temp1=h1;
    Node temp2=h2;
Node dummyhead=null;
Node dummytail=null;
int carry=0;

    while (temp1!=null && temp2!=null) {

        int p=temp1.data+temp2.data;
        // System.out.println(p);
int k=p%10;

        Node mm=new Node(k+carry);
        carry=p/10;
        System.out.println(carry);
        if (dummyhead==null) {
            dummyhead=mm;
            dummytail=mm;
            dummytail.next=null;

            
        }
        else{
            dummytail.next=mm;
            dummytail=mm;
        }
        temp1=temp1.next;
        temp2=temp2.next;


    }
    display(dummyhead);
   
}

private static void display(Node h1) {
   Node temp1=h1;

   while (temp1!=null) {
    System.out.print(temp1.data+" ");
    temp1=temp1.next;
   }
  

}
    
}
