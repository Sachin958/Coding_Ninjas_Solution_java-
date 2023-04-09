package Stack;

import java.util.Stack;
import java.util.*;

public class Brackets_Balanced {
    public static boolean isbalanced(String Expression){
        if(Expression == " ")
        return true;

        Stack<Character> st = new Stack<>();

        for (int i =0; i<Expression.length(); i++){
            if(Expression.charAt(i) == '('){
                st.push(Expression.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char tc = st.pop();
            }
        }
        return st.isEmpty();

    }
    public static void main(String args[]){
        String Expression = "(()))";
       boolean is =  isbalanced(Expression);
       System.out.println(is);
    }

}
