/**
 * Created by YuRacle on 2018/3/27.
 * 判断素数
 */
import java.util.*;
public class Main1_28 {

    public static int isPrme(int a) {
        if (a == 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        for (int j = 2; j<= Math.sqrt(a); j++) {
            if (a % j == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =0; i<n; i++) {
            int a = sc.nextInt();

            if (isPrme(a) == 1) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
