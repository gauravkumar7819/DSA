package Lec24;

public class Stack {
    int [] st;
    int tos=-1;
    int size;
   public  Stack(){
    st=new int[5];

    }
   public Stack(int size){
    st=new int[size];

    }
    public boolean  isfull(){
        if (tos==st.length-1) {
            // System.out.println("overflow");
            return true;
        }
return false;
    }
   public boolean  isEmpty(){
    if (tos==-1) {
        // System.out.println("Stack is empty");
        return true;
    }
return false;
    }
    public void push(int data) throws Exception{
        if (isfull()) {
            throw new Exception("Overflow");
            
        }
        tos=tos+1;;
        st[tos]=data;
        size++;
    }
    public int  pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("underflow");
            
        }
        int data=st[tos];
        tos=tos-1;
        size--;
        return data;
    }
    public int  peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("underflow");
            
        }
        int data=st[tos];
        // tos=tos-1;
        // size--;
        return data;
    }
    public int  stsize() throws Exception{
        if (isEmpty()) {
            throw new Exception("underflow");
            
        }
        int data=size;
        // tos=tos-1;
        // size--;
        return data;
    }
    public static void main(String[] args) {
        // implimenttion

    }
}
