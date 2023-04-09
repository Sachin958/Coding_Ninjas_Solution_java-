import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


public  class LinkedList {
    static Node head;
    static Node tail;
    static int size;


   static int middle(){
       Node s = head;
       Node f = head;
        if(head == null || head.next == null){
            return 0;
        }
        while(f.next!= null && f.next.next!= null){
            s = s.next ;
            f = f.next.next;
        }
        return s.data;
    }
    static void reverse(){
       Node curr = head;
       Node pre = null;
       while(curr != null){
           Node fwd = curr.next;
           curr.next = pre;
           pre = curr;
           curr = fwd;
       }
       head = pre;
    }

    //add a node at first
    static void addfirst(int x){
        Node first = new Node(x);
        if(size == 0){
            head = first;
            tail = first;
        }else{
            first.next = head;
            head = first;
        }
        size++;
    }
    //add node at last
    static void addlast(int x){
        Node last = new Node(x);
        if(size == 0){
            head = last;
            tail = last;
        }else{
            tail.next = last;
            tail = last;
        }
        size++;
    }
     //remove node at first
    static void removefirst(){
        if(size == 0){
            System.out.print("size 0 can not remove");
            return;
        }else if(size == 1){
            head = null;
            tail = null;
        }else {
            head = head.next;
        }
    }

    //remove node at last
    static void removelast(){
        if(size == 0){
            System.out.print("size 0 can not remove");
            return;
        }else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            Node temp = head;
            while(temp.next!= tail){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
//    static boolean isPalindrone(){
//        Node s = head;
//        Node f = head;
//    }


    static void printll(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }



    public static void main(String args[]){
//        System.out.print("Hello");
      addfirst(50);
      addfirst(40);
      addfirst(30);
      addfirst(20);
      addfirst(10);
      printll();
      addlast(60);
      addlast(70);
      addlast(80);
      System.out.println();
      printll();
      removefirst();
      System.out.println();
      printll();
      removelast();
      System.out.println();
      printll();
      System.out.println();
      System.out.println(middle());

      reverse();

    }
}
