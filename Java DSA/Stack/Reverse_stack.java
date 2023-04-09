package Stack;

import java.util.Stack;

public class Reverse_stack {
    public static void main(String args[]){
//        1 . Reverse Stack
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
        st = st2;
        System.out.println(st2);
    }
}
