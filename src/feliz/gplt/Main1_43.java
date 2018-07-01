/**
 * Created by YuRacle on 2018/3/26.
 */
import java.util.*;
public class Main1_43 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //                    天 书号  时间
        int[][] times = new int[n][1000];
        //                   天 书号   操作符号
        String[][] ops = new String[n][1000];
        //                     天 书号  借还次数
        int[][] counts = new int[n][1000];
        int[] aveCount = new int[n];
        int[] aveTime = new int[n];
        int tSum[] = new int[n];

        for (int i = 0; i< n; i++) {
            while (sc.hasNext()) {
                int id = sc.nextInt();
                String s = sc.next();
                ops[i][id] = s;
                String time = sc.next();
                if (id == 0) {
                    break;
                }
                String[] t = time.split(":");

                counts[i][id] ++;
                if (counts[i][id] == 1 && s.equals("E")) {
                    continue;
                }
                if (counts[i][id] != 1 && counts[i][id] % 2 == 0) {
                    tSum[i] += (Integer.valueOf(t[0])*60 + Integer.valueOf(t[1])) - times[i][id];

                }else{
                    times[i][id] = Integer.valueOf(t[0])*60 + Integer.valueOf(t[1]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j=0; j < times[i].length; j++) {
                if (counts[i][j] != 0 && counts[i][j] % 2 ==0) {
                    aveCount[i] += counts[i][j]/2;
                    aveTime[i] = (int)Math.rint((double)tSum[i]/aveCount[i]);
                }
            }
        }
        for (int i=0; i < n; i++) {
            System.out.println(aveCount[i]+" "+aveTime[i]);
        }
    }
}
