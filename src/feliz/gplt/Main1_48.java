/**
 * Created by YuRacle on 2018/3/24.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main1_48 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[] str = s.split(" ");
        int ra = Integer.valueOf(str[0]);
        int ca = Integer.valueOf(str[1]);
        int[][] ma = new int[ra][ca];
        for (int i = 0; i < ra; i++) {
            String s1 = in.readLine();
            String[] str1 = s1.split(" ");
            for (int j = 0; j < ca; j++) {
                ma[i][j] = Integer.valueOf(str1[j]);
            }
        }
        String s2 = in.readLine();
        String[] str2 = s2.split(" ");
        int rb = Integer.valueOf(str2[0]);
        int cb = Integer.valueOf(str2[1]);
        int[][] mb = new int[rb][cb];
        for (int i = 0; i < rb; i++) {
            String s3 = in.readLine();
            String[] str3 = s3.split(" ");
            for (int j = 0; j < cb; j++) {
                mb[i][j] = Integer.valueOf(str3[j]);
            }
        }

        if(ca != rb) {
            System.out.println("Error: "+ca+" != "+rb);
            return;
        }

        int[][] m = new int[ra][cb];

        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < cb; j++) {
                int sum=0;
                for (int k = 0; k < ca; k++) {
                    sum += ma[i][k]*mb[k][j];
                    //m[i][j] += ma[i][k]*mb[k][j];
                }
                m[i][j] = sum;
            }
        }

        System.out.println(ra+" "+cb);
        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < cb; j++) {
                if (j != cb-1) {
                    System.out.print(m[i][j]+" ");
                }else {
                    System.out.print(m[i][j]);
                }
            }
            System.out.println();
        }
    }
}

