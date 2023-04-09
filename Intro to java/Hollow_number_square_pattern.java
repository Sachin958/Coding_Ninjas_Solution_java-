import java.util.Scanner;

public class Hollow_number_square_pattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = 1;
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==0||i==n-1){
                    System.out.print(num++);
                }else {
                    if (j == 0 || j == n - 1) {
                        System.out.print(num++);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            num = 1;
            System.out.println();
        }
    }
}
