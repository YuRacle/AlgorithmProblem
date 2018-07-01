/**
 * Created by YuRacle on 2018/3/24.
 */
import java.util.*;
public class Main1_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index=0;
        while(sc.hasNext()) {
            int n = sc.nextInt();
            index++;
            while (n == 250) {
                System.out.println(index);
                return;
            }
        }
    }
}
