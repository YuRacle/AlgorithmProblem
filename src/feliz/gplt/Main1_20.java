/**
 * Created by YuRacle on 2018/3/28.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main1_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(in.readLine());
        Friends[] friends = new Friends[n];
        for (int i=0; i < n; i++) {
            StringBuffer s1 = new StringBuffer(in.readLine());
            String[] str1 = s1.toString().split(" ");
            int k = Integer.valueOf(str1[0]);
            int id[] = new int[k];
            for (int j=0; j<k; j++) {
                id[j] = Integer.valueOf(str1[j+1]);
            }
            friends[i] = new Friends(k, id);
        }

        int m = Integer.valueOf(in.readLine());
        if (m == 0) {
            System.out.println("No one is handsome");
            return;
        }

        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        StringBuffer s2 = new StringBuffer(in.readLine());
        String[] str2 = s2.toString().split(" ");
        for (int i=0; i<m; i++) {
            hashSet.add(Integer.valueOf(str2[i]));
        }
        int hasFlag = 0;
        int k=0;
        for (int id : hashSet) {
            int flag = 0;

            for (int i =0; i<n; i++) {
                if (friends[i].hasFriend(id)) {
                    flag = 1;
                    hasFlag ++;
                    break;
                }
            }
            if (flag == 0) {
                k++;
                if (k != 1) {
                    System.out.print(" ");
                }
                System.out.printf("%05d",id);
            }
        }
        if (hasFlag == m) {
            System.out.println("No one is handsome");
        }

    }
}

class Friends {
    int num;
    LinkedHashSet<Integer> ids = new LinkedHashSet<Integer>();

    public Friends(int num, int[] id) {
        this.num = num;
        for (int p : id) {
            ids.add(p);
        }
    }

    public boolean hasFriend(int p) {
        if (num <= 1) {
            return false;
        }else {
            for (int id : ids) {
                if (id == p) {
                    return true;
                }
            }
        }
        return false;
    }
}
