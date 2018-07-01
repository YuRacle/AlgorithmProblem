/**
 * Created by YuRacle on 2018/3/24.
 */
import java.util.*;
public class Main1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double count = 0;
        int len;
        if (s.charAt(0)=='-') {
           len = s.length()-1;
        }else {
            len =s.length();
        }

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)-'0' == 2) {
                count++;
            }
        }
        double res = (count/len) * 100;

        if (s.charAt(0)=='-') {
            res *= 1.5;
            if ((s.charAt(len)-'0')%2 == 0) {
                res *= 2;
            }
        }else if ((s.charAt(len-1)-'0')%2 == 0) {
            res *= 2;
        }
        System.out.printf("%.2f",Math.rint(res*100)/100);
        System.out.print("%");
    }
}
