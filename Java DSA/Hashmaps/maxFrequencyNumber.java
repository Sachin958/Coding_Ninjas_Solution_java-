package Hashmaps;
import java.util.HashMap;
public class maxFrequencyNumber {

    public static int maxFrequencyNumber(int[] arr){
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int count = 0;
        int maxKey=Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length; i++){
            if(map.get(arr[i])>count){
                count  = map.get(arr[i]);
                maxKey = arr[i];
            }
        }
        return maxKey;

    }
}

