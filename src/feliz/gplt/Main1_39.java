/**
 * Created by YuRacle on 2018/3/26.
 */
import java.util.*;
public class Main1_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int len = str.length();
        int lie;
        if (len % n == 0) {
            lie = len/n;
        }else {
            lie = len/n +1;
        }
        String[][] strings = new String[n][lie];

        int index = 0;
        for (int i = lie-1; i>=0; i--) {
            for (int j = 0; j<n; j++) {
                if (index < len) {
                    strings[j][i] = str.charAt(index)+"";
                    index++;
                }else {
                    strings[j][i] = " ";
                }
            }
        }

        for (int i = 0; i<n; i++) {
            for (int j =0; j<lie; j++) {
                System.out.print(strings[i][j]);
            }
            System.out.println();
        }
    }
}
