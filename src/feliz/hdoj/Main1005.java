//hdoj1005
import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) {
        int a,b,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            if(n!=0) {
                System.out.println(f(a,b,n%49));
            }
        }
    }
    public static int f(int a, int b, int n) {
        int f;
        if(n==1||n==2) {
            return 1;
        }
        f = (a*f(a,b,n-1)+b*f(a,b,n-2))%7;
        return f;
    }
}
