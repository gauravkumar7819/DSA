package Lec24;



public class StackImplement {
public static void main(String[] args) throws Exception {
    Stack ss=new Stack();
    System.out.println(ss.isEmpty());
    ss.push('a');
    ss.push('b');
    ss.push('c');
    ss.push('d');
    ss.push('e');
    // ss.push(50);
    while (!ss.isEmpty()) {
        
    
    System.out.println(ss.pop());}
    System.out.println(ss.isfull());
    // System.out.println(Arrays.toString(st));
}
}
