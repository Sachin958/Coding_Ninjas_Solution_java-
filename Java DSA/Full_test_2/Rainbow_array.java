package Full_test_2;
import java.util.HashMap;
public class Rainbow_array {
    public static void israinbow(int[] arr) {

        boolean isRainbow = true;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <= 7; i++) hashMap.put(i, 0);
        boolean inc = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 7) {

                isRainbow = false;
                break;
            }
            if (arr[i] == 7) {

                inc = false;
                continue;
            }
            if (inc) hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            else hashMap.put(arr[i], hashMap.get(arr[i]) - 1);
        }
        for (int i = 0; i < 7; i++) {

            if (hashMap.get(i) != 0) isRainbow = false;
        }
        if (isRainbow) System.out.println("yes");
        else System.out.println("no");
    }
}
