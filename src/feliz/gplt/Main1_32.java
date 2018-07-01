/**
 * Created by YuRacle on 2018/3/27.
 */
import java.util.*;

public class Main1_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.nextLine();
        String str = sc.nextLine();
        int len = str.length();
        if (n >= len) {
            for (int i=0; i < n-len; i++) {
                System.out.print(s);
            }
            System.out.println(str);
        }else {
            for (int i=len-n; i < len; i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
