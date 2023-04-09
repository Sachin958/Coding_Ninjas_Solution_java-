import java.util.Scanner;
public class SquarePatterns1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            for(int j = 1; j<=n; j++){
                System.out.print(j);
            }
            System.out.println();
            i++;
        }

    }

}