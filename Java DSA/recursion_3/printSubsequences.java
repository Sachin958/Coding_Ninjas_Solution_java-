package recursion_3;
import java.util.Scanner;
public class printSubsequences {
    public static String[] Subsequences(String input) {
        if (input.length() == 0) {
// base case
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallOutut = Subsequences(input.substring(1));
        String[] output = new String[smallOutut.length * 2];
        for (int i = 0; i < smallOutut.length; i++) {
            output[i] = smallOutut[i];
        }
        for (int i = 0; i < smallOutut.length; i++) {
            output[smallOutut.length + i] = input.substring(1);
        }
        return smallOutut;
    }
        public static void printsubsequences(String input, String stringSoFar) {
            if(input.length() == 0) {
                System.out.println(stringSoFar);
                return;
            }
            String smallInput = input.substring(1);
            printsubsequences(smallInput, stringSoFar);
            printsubsequences(smallInput, stringSoFar + input.charAt(0));
        }
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter String");
            String input = s.next();
            String output = s.next();
            printsubsequences(input," ");
//            for(String outputString: output) {
//                System.out.println(outputString);
//            }
        }
    }