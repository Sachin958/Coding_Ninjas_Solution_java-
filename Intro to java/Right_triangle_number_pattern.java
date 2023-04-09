import java.util.Scanner;

public class Right_triangle_number_pattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      //  int num = 1;
        for(int i = 0 ; i < n ; i++){
            //printing spaces
            for(int j = 1; j < n - i; j++){
                System.out.print(" ");
            }
            //printing numbers
            for(int k = 0 ; k <= i ; k++){
                System.out.print(k+1);
//                System.out.print(num++);
            }
           // num = 1;
            System.out.println();
        }
    }
}
