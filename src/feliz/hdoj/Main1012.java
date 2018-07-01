import java.util.*;

public class Main1012 {
    public static void main(String[] args) {
        int n=9;
        System.out.println("n e");
        System.out.println("- -----------");
        for(int j=0;j<=n;j++) {
            double e=0;
            for(int i=0;i<=j;i++) {
                e += 1/fun(i);
            }
            if(j<2) {
                System.out.println(j+" "+(int)e);
            }else if(j==2) {
                System.out.println(j+" "+e);
            }else {
                System.out.print(j+" ");
                System.out.printf("%.9f",e);
                System.out.println();
            }
        }
    }

    public static double fun(int n) {
        int sum=1;
        if (n==0) {
            sum=1;
        }else {
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
        }
        return sum;
    }
}
