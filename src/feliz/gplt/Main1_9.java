/**
 * Created by YuRacle on 2018/3/27.
 * L1-009 N个数求和(求最大公约数（辗转相除法）->最小公倍数 ->多个数最小公倍数)
 */
import java.util.*;

public class Main1_9 {

    public static long getGCD(long a, long b) {
        if (b==0) {
            return a;
        }else {
            return getGCD(b,a%b);
        }
    }

    public static long getLCM(long a,long b) {
        return (a*b) / getGCD(a,b);
    }

    public static long getMoreLCM(long[] a,int len) {
        if (len == 1) {
            return a[len-1];
        }
        long lcm = getLCM(a[0], a[1]);
        for (int i=2; i<len; i++) {
             lcm = getLCM(lcm, a[i]);
        }
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[n];//分子
        long[] den = new long[n];//分母
        for (int i=0; i<n; i++) {
            String str = sc.next();
            String[] strings = str.split("/");
            num[i] = Integer.valueOf(strings[0]);
            den[i] = Integer.valueOf(strings[1]);
        }
        long lcm = getMoreLCM(den, n);
        for (int i=0; i<n; i++) {
            long temp = lcm / den[i];
            den[i] = lcm;
            num[i] = num[i] * temp;
        }
        long fenzi = 0, fenmu = lcm;
        for (int i=0; i<n; i++) {
            fenzi += num[i];
        }
        long zhengshu = fenzi/fenmu;
        fenzi = fenzi - zhengshu*fenmu;
        long t = getGCD(fenzi,fenmu);
        fenzi /= t;
        fenmu /= t;

        if (zhengshu == 0) {
            if (fenzi == 0) {
                System.out.println(zhengshu);
            }else {
                System.out.println(fenzi+"/"+fenmu);
            }
        }else if (fenzi == 0){
            System.out.println(zhengshu);
        }else{
                System.out.println(zhengshu + " " +(fenzi+"/"+fenmu));
        }
    }
}
