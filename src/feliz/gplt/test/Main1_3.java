/**
 * Created by YuRacle on 2018/3/25.
 */
import java.util.*;
public class Main1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n =sc.next();
        String a = sc.next();
        String b = sc.next();

        int[] res = new int[10];
        int lena = a.length();
        int lenb = b.length();
        int lenn = n.length();
        int num = 0;
        int next=0;

        int max = lena;
        if (lenb > lena) {
            max = lenb;
        }

        for (int i=lena-1,j=lenb-1; i >=0&&j>=0; i--,j--) {
            if (a.charAt(i) != '\0' && b.charAt(j) != '\0') {
                num = (a.charAt(i)-'0') + (b.charAt(j)-'0');
            }else if (a.charAt(j) == '\0') {
                num = (b.charAt(j)-'0');
            }else {
                num = (a.charAt(i)-'0');
            }
            if (next !=0) {
                res[i] = num % (n.charAt(lenn-1)-'0')+next;
            }else {
                res[i] = num % (n.charAt(lenn-1)-'0');
            }
            next = num / (n.charAt(lenn-1)-'0');
        }
        for (int k = res.length-1; k >= 0; k--) {
            if (res[k] !=0) {
                System.out.print(res[k]);
            }
        }
    }
}
