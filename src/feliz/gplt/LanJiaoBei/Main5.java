package LanJiaoBei;

/**
 * Created by YuRacle on 2018/3/31.
 */

import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        for (int i=1; i<n;i++) {
            for (int j=1; j<n;j++) {
                if (i+j>n && i+n>j && j+n>i) {
                    if ((i*i + j*j) == n*n) {
                        num++;
                    }
                }
            }
        }
        System.out.println(num/2);
    }
}
