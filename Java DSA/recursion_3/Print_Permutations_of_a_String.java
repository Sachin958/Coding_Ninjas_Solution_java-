package recursion_3;

public class Print_Permutations_of_a_String {
    public static void FindPermutations(String input) {
        // Write your code here

        print(input,"");

    }

    private static void print(String input,String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }

        for(int i=0;i<input.length();i++){
            String str = input.substring(0,i) + input.substring(i+1,input.length());
            print(str , output + input.charAt(i));
        }
    }
}
