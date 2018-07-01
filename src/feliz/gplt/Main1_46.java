/**
 * Created by YuRacle on 2018/3/28.
 * 整除光棍（模拟除法算法，BigInteger（运行只能用自带函数））
 */
import java.util.Scanner;
import java.math.BigInteger;
public class Main1_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int k = 1;
        int ans = 1;
        while (k != 0 && k < x) {
            k = k*10 + 1;
            k = k % x;
            ans++;
        }

        StringBuilder s = new StringBuilder();
        for (int i=0; i < ans; i++) {
            s.append("1");
        }

        BigInteger bi1 = BigInteger.valueOf(x);
        BigInteger bi2 = new BigInteger(String.valueOf(s));
        System.out.println(bi2.divide(bi1)+" "+ans);
    }
}
