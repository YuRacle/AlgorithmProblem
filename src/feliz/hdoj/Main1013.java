//hdoj 1013
//大数据，String录入，转化成char储存，转化成int计算
import java.util.*;

public class Main1013 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            s = sc.next();
            char[] c = s.toCharArray();
            if(c[0]=='0') {
                return;
            }else if (c.length==1) {
                System.out.println(c[0]);
            }
            else {
                c = fun(c);
                System.out.println(c[0]);
            }
        }
    }
    public static char[] fun(char[] c) {
        while (c.length>=2) {
            int sum=0;
            for (int i = 0; i < c.length; i++) {
                //字符->整数(字符->字符串->整数)
                sum += Integer.parseInt(String.valueOf(c[i]));
            }
            //整数->字符(整数->字符串->字符）
            c = String.valueOf(sum).toCharArray();
        }
        return c;
    }
}
