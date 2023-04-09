
import java.util.Scanner;
public class ReversePattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i=0; i<n; i++){
          for(int j=n; j>0; j--){
              System.out.print(j+" ");
          }
          System.out.println();
      }
    }

}