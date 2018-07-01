//hdoj1008
import java.util.*;

public class Main1008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n;
            int a[] = new int[100];
            int time=0;
            n=sc.nextInt();
            if(n==0){
                return;
            }
            for(int i=1;i<=n;i++) {
                a[i]=sc.nextInt();
            }
            for(int i=1;i<=n;i++) {
                if(i==1) {
                    time = a[i]*6;
                }
                else if(a[i]>a[i-1]) {
                    time += (a[i] - a[i-1]) * 6;
                }else {
                    time += (a[i-1] - a[i])*4;
                }
            }
            System.out.println(time+5*n);
        }
    }
}
