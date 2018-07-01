/**
 * hdoj1017
 */
import java.util.*;

public class Main1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while((t--)>0) {
            int index=0;
            while (sc.hasNext()) {
                int sum=0;
                int n=sc.nextInt();
                int m=sc.nextInt();
                if(n==0&&m==0) {
                    break;
                }
                for(int a=1;a<n-1;a++) {
                    for(int b=a+1;b<n;b++) {
                        if((a*a+b*b+m)%(a*b)==0) {
                            sum++;
                        }
                    }
                }
                System.out.println("Case "+(++index)+": "+sum);
            }
            if (t!=0)
                System.out.println();
        }
    }
}


