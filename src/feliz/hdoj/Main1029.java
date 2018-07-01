/**
 * hdoj 1029,找出现半数以上的数.
 * 参考：
 * http://blog.csdn.net/bruce128/article/details/7050547
 */
import java.util.*;

public class Main1029 {
    public static void main(String[] args) {
        int a,count,max=0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            count=0;
            for(int i=0; i<n; i++) {
                a = sc.nextInt();
                if(count==0) {
                    max = a;
                    count++;
                }else if(max != a) {
                    count--;
                }else if(max == a) {
                    count++;
                }
            }
            System.out.println(max);
        }
    }
}
