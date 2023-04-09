package Stack;

import DP1.Stair_Case;

import java.util.Stack;

public class Reverse_Stack_3_recursion {
    static void reverseStack(Stack<Integer> st , Stack<Integer> st2){
        if(st.size()==0|| st.size()==1){
            return;
        }
        int a = st.pop();
        reverseStack(st, st2);
        while(st.size()>0){
            st2.push(st.pop());
        }
        st.push(a);
        while(st2.size()>0){
            st.push((st2.pop()));
        }
        System.out.println(st);
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseStack(st ,st2);
    }
}
