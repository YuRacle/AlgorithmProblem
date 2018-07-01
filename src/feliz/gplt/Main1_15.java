/**
 * Created by YuRacle on 2018/3/24.
 */
import java.util.*;
public class Main1_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        String c = sc.next();

        for (int i=0; i<n/2; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
