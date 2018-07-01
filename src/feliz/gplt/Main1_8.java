/**
 * Created by YuRacle on 2018/3/24.
 */
import java.util.*;
public class Main1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int index=0;
        for (int i = a; i <= b; i++) {
            System.out.printf("%5d",i);
            index++;
            if (index%5 == 0 || i==b) {
                System.out.println();
            }
        }
        System.out.println("Sum = "+(a+b)*(Math.abs(a-b)+1)/2);
    }
}
