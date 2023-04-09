package Test_7;
import java.util.Scanner;
/*
Team Selection

CodingNinjasLand is hosting this edition of Kabaddi World Cup. Selection committee of CodingNinjasLand needs your help. They want to select a 12-membered team. You have to print all possible combinations of the team, so, that selectors can select any one combination for World Cup at GitNagar, CodingNinjasLand.
Input Format
First line contains N - (Integer)
Second line contains N spaced integers which are player Id of players. Note that, all the N integers are given in sorted order.
Constraints
12<= N <= 20
1<= A(i) <=1000
Output Format
Print the combinations in N lines.
Sample Input 0
13
1 2 3 4 5 6 7 8 9 10 11 12 13
Sample Output 0
1 2 3 4 5 6 7 8 9 10 11 12
1 2 3 4 5 6 7 8 9 10 11 13
1 2 3 4 5 6 7 8 9 10 12 13
1 2 3 4 5 6 7 8 9 11 12 13
1 2 3 4 5 6 7 8 10 11 12 13
1 2 3 4 5 6 7 9 10 11 12 13
1 2 3 4 5 6 8 9 10 11 12 13
1 2 3 4 5 7 8 9 10 11 12 13
1 2 3 4 6 7 8 9 10 11 12 13
1 2 3 5 6 7 8 9 10 11 12 13
1 2 4 5 6 7 8 9 10 11 12 13
1 3 4 5 6 7 8 9 10 11 12 13
2 3 4 5 6 7 8 9 10 11 12 13
*/

public class Team_Selection {
    public static void combinationUtil(int arr[], int data[], int start, int end, int index, int r) {

        if (index == r) {
            for (int j = 0; j < r; j++)
                System.out.print(data[j] + " ");
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }
    public static void printCombination(int arr[], int n, int r) {

        int data[] = new int[r];

        combinationUtil(arr, data, 0, n - 1, 0, r);
    }


    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = scn.nextInt();
        }
        printCombination(arr, n, 12);
    }

}
