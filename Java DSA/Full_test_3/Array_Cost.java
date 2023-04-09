package Full_test_3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array_Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if ((i + 1) % 3 == 0) sum -= arr[i];
        }
        System.out.println(sum);
    }
}
