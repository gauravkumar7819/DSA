package Lec29;

import java.util.Arrays;

public class Queue {
    int [] queue;
    int front=0;
    int rear=-1;
    int size;
    public Queue(){
        queue=new int[5];
    }
    public Queue(int size){
        queue=new int[size];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==queue.length;
    }
    public void display(){
        System.out.println(Arrays.toString(queue));
    }
    public void enqueue(int val) throws Exception{
        if (isFull()){
            throw new Exception("queue is full");
        }
        int idx=(rear+1)% queue.length;
        rear=idx;
        queue[idx]=val;
        size++;
    }
    public void dequeue() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is Empty");
        }
        int val=queue[front];
        front =(front+1)%queue.length;
        
        size--;
       
    }

}