package recursion_3;

public class Print_subsets_of_Array {
    public static void printSubsets(int input[]) {
        // Write your code here
        int output[]=new int[0];
        printsubsets(input,0,output);
    }
    public static void printsubsets(int input[],int si,int output[])
    {
        if(si==input.length)
        {
            for(int i:output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        printsubsets(input,si+1,output);

        int newoutput[]=new int[output.length+1];
        int j=0;
        for( ;j<output.length;j++)
        {
            newoutput[j]=output[j];
        }
        newoutput[j]=input[si];
        printsubsets(input,si+1,newoutput);
    }
}