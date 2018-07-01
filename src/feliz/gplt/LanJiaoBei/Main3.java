package LanJiaoBei;

/**
 * Created by YuRacle on 2018/3/31.
 */
public class Main3 {
    public static void main(String[] args) {
        int sum = 10;
        for (double i=2.0; i<3.0; i+=0.0000001) {
            if (Math.abs(Math.pow(i,i) - sum) < 0.000001) {
                System.out.printf("%.8f",i);//输多2位小数，检查防止四舍五入错误
                return;
            }
        }
    }
}
