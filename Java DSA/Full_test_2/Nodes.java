package Full_test_2;
import java.util.*;
import java.lang.*;
class Node{
    int data;
    Node next;
    Node (int key)
    {
        data=key;
        next=null;
    }
}
public class Nodes{
    static Node head;
    public static void main (String[] args) {
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        Node head=new Node(a);
        Node prev=head;
        for(int i=0;i<n-1;i++)
        {
            a=s.nextInt();
            Node newnode=new Node(a);
            prev.next=newnode;
            prev=newnode;
        }
        int k=s.nextInt();
        Node ans=Reverse_the_Linked_List.reverse(head,k);
        prev=ans;
        for(int i=0;i<n;i++)
        {
            System.out.print(prev.data+" ");
            prev=prev.next;
        }

    }
}