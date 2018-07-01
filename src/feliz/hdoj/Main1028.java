/**
 * hdoj 1028 整数分解
 * 参考：
 * http://www.cnblogs.com/qiufeihai/archive/2012/09/11/2680840.html
 */

import java.util.*;

public class Main1028 {
    public static void main(String[] args) {
        int[] dp = new int[120+10];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < dp.length; i++) {
                dp[i]=0;
            }

            dp[0] = 1;

            for(int i =1; i <=n; i++) {
                for(int j =i; j <=n; j++) {
                    dp[j] += dp[j-i];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
