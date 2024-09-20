package Lec29;

public class impliQue {
public static void main(String[] args) throws Exception {
    Queue q=new Queue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.dequeue();
System.out.println(q.isEmpty());
System.out.println(q.isFull());
q.display();
}
}
