package Full_test_2;
import java.util.Scanner;
public class Binomial_Expansion {

    static void series(int A, int X, int n) {
        int term = (int) Math.pow(A, n);
        System.out.print(term + " ");
        for (int i = 1; i <= n; i++) {
            term = term * X * (n - i + 1)
                    / (i * A);
            System.out.print(term + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        series(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
