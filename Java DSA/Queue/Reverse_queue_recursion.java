package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse_queue_recursion {
    static void reverseQueue(Queue<Integer>q){
     if(q.size() <=1){
         return ;
     }
     int x = q.remove();
     reverseQueue(q);
     q.add(x);
    }
    public static void main(String args[]){
        Queue<Integer>  q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q);
//        System.out.println(q.size());
//        System.out.println(q.remove());
//        System.out.println(q.size());
          System.out.println(q);
          reverseQueue(q);
          System.out.println(q.isEmpty());
          System.out.println(q);
    }
}
