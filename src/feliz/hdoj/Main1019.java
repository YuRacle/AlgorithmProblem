/**
 * hdoj1019
 */
import java.util.*;

public class Main1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--)>0) {
            int m=sc.nextInt();
            int[] n = new int[m];
            for(int i=0;i<m;i++) {
                n[i]=sc.nextInt();
            }
            int k=n[0];
            int temp;
            for(int i=1;i<m;i++) {
                if(k>n[i]) {
                    temp = n[i];
                    n[i] = k;
                    k = temp;
                }
                k=GetLCM(n[i],k,GetGCD(n[i],k));
            }
            System.out.println(k);
        }
    }

    public static int GetLCM(int a,int b,int gcd) {
        return a*(b/gcd);//先除再乘防止越界
    }

    public static int GetGCD(int b,int k) {
        while(k>0) {
            int temp=b%k;
            b=k;
            k=temp;
        }
        return b;
    }
}
