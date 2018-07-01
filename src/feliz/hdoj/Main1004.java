//hdoj 1004
import java.util.Scanner;

public class Main1004 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            String[] s = new String[1000];
            int[] count = new int[1000];
            n = sc.nextInt();
            if(n==0) {
                break;
            }
            for(int i =0;i<n;i++) {
                s[i] = sc.next();
                for(int j=0;j<i;j++) {
                    if(s[i].equals(s[j])) {
                        count[j]++;
                        break;
                    }
                }
                count[i]++;
            }
            int max=0;
            int maxNum=-1;
            for(int i=0;i<n;i++) {
                if(count[i]>max) {
                    max=count[i];
                    maxNum=i;
                }
            }
            System.out.println(s[maxNum]);
        }
    }
}
