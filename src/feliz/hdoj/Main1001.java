/**
 * hdoj1001
 */
import java.util.Scanner;

public class Main1001 {
    public static void main(String[] args) {
        int n,sum;
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()) {
            sum=0;
            n=sc.nextInt();
            for(int i =1;i<=n;i++) {
                sum += i;
            }
            System.out.println(sum);
            System.out.println();
        }

    }
}
