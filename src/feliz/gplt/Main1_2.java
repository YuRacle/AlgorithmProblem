import java.util.Scanner;

/**
 * Created by YuRacle on 2018/3/24.
 * L1-002 打印沙漏
 */
public class Main1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum = 1;
            int index = 1;
            int max;
            int n = sc.nextInt();
            String c = sc.next();

            while (sum <= n) {
                index += 2;
                sum += index*2;
            }
            sum -= index*2;
            index -= 2;
            max = index;

            while(max != 1) {
                for (int j = max; j < index; j += 2) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= max; i++) {
                    System.out.print(c);
                }
                System.out.println();
                max -= 2;
            }
            while(max <= index) {
                for (int j = max; j < index; j += 2) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= max; i++) {
                    System.out.print(c);
                }
                max += 2;
                System.out.println();
            }
            System.out.println(n-sum);
        }
    }
}
