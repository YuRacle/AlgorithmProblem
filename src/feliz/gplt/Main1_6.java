/**
 * Created by YuRacle on 2018/3/24.
 * L1-006 连续因子
 */
import java.util.*;
public class Main1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len=0,index = 0,sum;
        int n = sc.nextInt();
        if (isPrime(n) == 1) {
            System.out.println(1);
            System.out.println(n);
            return;
        }
        double k=Math.sqrt(n)+2;
        int i,j;
        for (i=2; i < k; i++) {
            if (n%i == 0) {
                sum = i;
                for (j=i+1; j < k;j++) {
                    sum *= j;
                    if(n%sum != 0) {
                        break;
                    }
                }
                if (len < j-i) {
                    len = j-i;
                    index = i;
                }
            }
        }
        System.out.println(len);
        for (i = index; i< index+len-1 ;i++) {
            System.out.print(i+"*");
        }
        System.out.print(index+len-1);
    }

    public static int isPrime(int n) {
        for (int i=2; i < Math.sqrt(n)+2; i++) {
            if (n%i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
