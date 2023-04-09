package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class inbuildHashmap {
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();

        map.put("abc" , 1);
        map.put("def" , 4);

        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }

        if(map.containsKey("aaa")){
            System.out.println("map has aaa");
        }

        int a = map.get("abc");
        System.out.println(a);

        int count = 0;
        if(map.containsKey("aaa")){
            count = map.get("aaa");
        }
        System.out.println(count);

        map.remove("abc");
        System.out.println(map.size());

        Set<String> keys = map.keySet();
        for (String s :keys){
            System.out.println(s);
        }
    }
}
