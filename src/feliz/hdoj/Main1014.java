//hdoi1014
/*随机函数
* seed(x+1) = [seed(x) + STEP] % MOD
* 找step和mod的最大公约数，等1时为Good，否为Bad。
*/
import java.util.*;

public class Main1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step,mod;
        while(sc.hasNextInt()) {
            step = sc.nextInt();
            mod = sc.nextInt();
            if(getGCD(step,mod)==1) {
                System.out.printf("%10d%10d    Good Choice",step,mod);
                System.out.println();
                System.out.println();
            }else {
                System.out.printf("%10d%10d    Bad Choice",step,mod);
                System.out.println();
                System.out.println();
            }
        }
    }

    public static int getGCD(int small,int big) {
        int t=small;
        while((t=big%small)!=0) {
            big = small;
            small = t;
        }
        return small;
    }
}
