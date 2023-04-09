package Stack;

import java.util.Stack;

public class Brackets_Balanced_2 {
    public static boolean isbalanced(String str){
        if(str == " "){
            return true;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i) == '{'){
                st.push(str.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char top = st.pop();
                }
            }

        }
        return st.isEmpty();
    }
    public static void main(String args[]){
        String Expression = "(([{}]))";
        boolean ans = isbalanced(Expression);
        System.out.println(ans);
    }
}
