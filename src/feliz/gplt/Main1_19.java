/**
 * Created by YuRacle on 2018/3/28.
 */
import java.util.Scanner;

public class Main1_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ca = sc.nextInt();
        int cb = sc.nextInt();
        int n = sc.nextInt();
        int ahan, ahua;
        int bhan, bhua;
        int a = ca, b = cb;
        for (int i = 0; i < n; i++) {
            ahan = sc.nextInt();
            ahua = sc.nextInt();
            bhan = sc.nextInt();
            bhua = sc.nextInt();

            int sum = ahan + bhan;

            if (sum == ahua && sum == bhua) {
                continue;
            }else if (sum == ahua) {
                ca --;
            }else if (sum == bhua){
                cb --;
            }else {
                continue;
            }
            if (ca < 0) {
                System.out.println("A");
                System.out.println(b - cb);
                return;
            }
            if (cb < 0) {
                System.out.println("B");
                System.out.println(a - ca);
                return;
            }
        }
    }
}
