/**
 * Created by YuRacle on 2018/2/8.
 */

import java.util.*;

public class Main1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,max, temp;
        while (sc.hasNext()) {
            max = 0;
            int i = sc.nextInt();
            int j = sc.nextInt();
            a = i;
            b = j;
            if (a > b) {
                temp = b;
                b = a;
                a = temp;
            }
            for (int n = a; n <= b; n++) {
                if (fun(n) > max) {
                    max = fun(n);
                }
            }
            System.out.println(i + " " + j + " " + max);
        }
    }

    public static int fun(int n) {
        int count = 1;
        while (n != 1) {
            count++;
            if (n % 2 != 0) {
                n = 3 * n + 1;
            } else {
                n = n / 2;//等同于n/2
            }

        }
        return count;
    }
}






