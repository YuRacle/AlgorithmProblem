/**
 * Created by YuRacle on 2018/3/24.
 * L1-005 考试座位号
 */

import java.io.*;
import java.util.*;
public class Main1_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(in.readLine());
        String[][] strings = new String[n+1][10001];

        for (int i=0; i<n; i++) {

            String s = in.readLine();
            String[] str = s.split(" ");

            strings[Integer.valueOf(str[1])] = str;
        }

        int m = Integer.valueOf(in.readLine());
        String ss = in.readLine();
        String[] sm = ss.split(" ");
        int[] check = new int[m];
        for (int i=0; i<m; i++) {
            check[i] = Integer.valueOf(sm[i]);
        }
        for (int i = 0; i<m; i++) {
            System.out.println(strings[check[i]][0]+" "+strings[check[i]][2]);
        }
        in.close();
    }
}
