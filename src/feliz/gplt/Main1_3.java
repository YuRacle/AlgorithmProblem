/**
 * Created by YuRacle on 2018/3/24.
 * L1-003 个位数统计
 */
import java.util.*;
public class Main1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] count = new int[10];

        for (int j=0; j<n.length(); j++) {
            for (int i = 0; i < 10; i++) {
                if ( n.charAt(j) - '0' == i) {
                    count[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] != 0) {
                System.out.println(i+":"+count[i]);
            }
        }
    }
}
