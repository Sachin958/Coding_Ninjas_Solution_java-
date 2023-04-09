package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_2_Queues {

    private Queue<Integer> q1 ;
    private Queue<Integer> q2 ;
    int size;

    public Stack_Using_2_Queues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }

    public int getSize() {
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    public void push(int x){
        q1.add(x);
        size++;
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int topElement = q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        size--;
        return topElement;
    }
    public int top(){
        if(q1.isEmpty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int topElement = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return topElement;
    }
    public static void main(String args[]){
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(q1.isEmpty());
        System.out.println(q1.size());
        q1.peek();
        System.out.println(q1);
        System.out.println(q1.isEmpty());
    }
}
