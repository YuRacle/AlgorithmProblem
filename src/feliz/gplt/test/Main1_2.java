/**
 * Created by YuRacle on 2018/3/25.
 */
import java.util.*;
public class Main1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] str = new String[3];
        str = s.split(":");
        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        if( (h >= 0 && h < 12) || (h == 12  || h == 24)&& m == 0) {
            System.out.println("Only "+s+".  Too early to Dang.");
        }else {
            for (int i=0; i < h; i++) {
                System.out.print("Dang");
            }
        }
    }
}
