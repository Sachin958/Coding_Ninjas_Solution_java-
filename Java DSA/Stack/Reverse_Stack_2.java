package Stack;

import javax.swing.*;
import java.util.Stack;

public class Reverse_Stack_2 {
    public static void main(String args[]){
//        Reverse stack without changing the address;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        while(st.size()>0){
            st2.push(st.pop());
        }
        Stack<Integer> st3 = new Stack<>();
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        while(st3.size()>0){
            st.push(st3.pop());
        }
        System.out.println(st);

    }
}
