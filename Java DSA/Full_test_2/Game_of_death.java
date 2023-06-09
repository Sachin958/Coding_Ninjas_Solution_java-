package Full_test_2;
import java.util.ArrayList;
import java.util.Scanner;

public class Game_of_death {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();
        System.out.println(safePos(n, k));
    }

    static int safePos(int n, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            al.add(i);
        }
        int index = 0;
        int ans = solve(al, k - 1, index);

        return ans;
    }

    static int solve(ArrayList<Integer> al, int k, int index) {
        if (al.size() == 1) {
            return al.get(0);
        }

        index = (index + k) % al.size();

        al.remove(index);

        return solve(al, k, index);

    }
}
