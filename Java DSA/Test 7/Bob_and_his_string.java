package Test_7;
import java.util.*;
/*
Bob and his string

King Bob is in playful mood today. He started playing with string S. As he was playing, a weird question came in his mind. He wondered what is the maximum number of characters, between any two same characters in the string. He needs your help in solving this question. Can you help him solve this question?
Note: String S is composed of lowercase letters of the Latin alphabet. If there are no two same characters in the string, print -1.
Input Format:
The first line of input contains one integer T, denoting the number of test cases.
Each of the next T line contains one string S.
Constraints:
1 < T < 10
1 < |S| < 100000, where S determines the length of the string.
String is composed of lowercase alphabets ranging from a to z.
Time limit : 1 sec
Output Format:
For each test case, output the maximum number of characters between any two same characters in the string. If there are no two same characters in the string, print -1.
Print answer for each test case in a new line.
Sample Input 1:
2
aba
babcddc
Sample Output 1:
1
2
Explanation:
1) For string = aba
There is only one character between 2 occurrences of a.

2) For string = babcddc
There is one character between 2 occurrences of b, and 2 characters between 2 occurrences of c. So the answer is 2.
*/

public class Bob_and_his_string {

    public static int sol(String s){

        if(s.length() == 1)
            return -1;

        int [] x = new int[26];
        int ascii = 97; //ASCII value of 'a'
        int si = -1, ei = 0, count = 0;
        boolean bool = false;

        for(int i=0; i<x.length; i++){

            for(int j=0; j<s.length(); j++){

                if(s.charAt(j) == (char)ascii){

                    if(si == -1)
                        si = j;
                    else{
                        ei = j;
                        count = ei - si - 1;

                        if(count == 0) //This is the case when string is aabbcc like that. Here 0 refres
                            bool = true; //that no elements exists b/w two characters

                        if(count > x[i])
                            x[i] = count;
                    }
                }
            }

            si = -1;
            ei = 0;
            count = 0;
            ascii++;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<x.length; i++){
            max = Math.max(x[i], max);
        }

        if(max == 0 && bool == true) //For the above mentioned case i.e. aabbcc we should return 0
            return 0;
        else if(max == 0 && bool == false)//This is the case when string is like abcdefgh i.e. there is no second
            return -1; //character to have a boundary and all charactres are repeated once. Hence we should return -1
        else
            return max;

    }

    public static void main(String[] args) {
        /* Your class should be named Main.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        // Write your code here
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i=0; i<n; i++){
            String si = s.next();
            System.out.println(sol(si));
        }

    }


}
