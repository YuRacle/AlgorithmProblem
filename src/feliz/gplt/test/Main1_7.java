/**
 * Created by YuRacle on 2018/3/25.
 */
import java.util.*;
public class Main1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h,w;
        for (int i=0; i<n; i++) {
            h = sc.nextInt();
            w = sc.nextInt();
            double res = (h-100)*0.9*2;
            if (Math.abs(w-res) < res*0.1) {
                System.out.println("You are wan mei!");
            }else if (w>res) {
                System.out.println("You are tai pang le!");
            }else {
                System.out.println("You are tai shou le!");
            }
        }

    }
}