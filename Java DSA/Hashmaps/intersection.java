package Hashmaps;
import java.util.Set;
import java.util.HashMap;
import java.util.*;
public class intersection {

    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        HashMap<Integer, Integer> map1 = new HashMap<>();

        // storing the arr1 into map, each element with their frequency
        for(int i = 0; i<arr1.length; i++){
            if( map1.containsKey(arr1[i])){
                map1.put(arr1[i], map1.get(arr1[i]) + 1);
            }else{
                map1.put(arr1[i], 1);
            }
        }

        //sorting arr2 so that we get order interSection elements in increasing order
        Arrays.sort(arr2);

        //checking intersection of arr2 element  in arr1 and print
        //if element present in map then reduce their frequency

        for(int i =0; i< arr2.length; i++){
            if( map1.containsKey(arr2[i])){

                if( map1.get(arr2[i]) > 0){
                    System.out.print(arr2[i] +" ");
                    map1.put(arr2[i], map1.get(arr2[i]) -1);
                }
            }
        }

    }

}

